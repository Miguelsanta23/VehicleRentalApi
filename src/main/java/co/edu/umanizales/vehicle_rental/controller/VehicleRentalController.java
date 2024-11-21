package co.edu.umanizales.vehicle_rental.controller;


import co.edu.umanizales.vehicle_rental.model.AbstractVehicle;
import org.example.vehicle_rental.AbstractVehicle;
import org.example.vehicle_rental.model.Motorbike;
import org.example.vehicle_rental.model.RentVehicle;
import org.example.vehicle_rental.service.UserManagementService;
import org.example.vehicle_rental.service.VehicleManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/vehicles")
public class VehicleRentalController {

    @Autowired
    private VehicleManagementService vehicleManagementService;


    @GetMapping
    public List<AbstractVehicle> listvehicles() {
        return vehicleManagementService.getVehicles();
    }


    @PostMapping("/register")
    public String registerVehicle(@RequestBody Motorbike motorbike) {
        vehicleManagementService.registerVehicle(motorbike);
        return "Vehícle successfully registered";
    }


    @PostMapping("/rent/{tuition}")
    public String vehicleRent(@PathVariable String tuition) {
        AbstractVehicle vehicle = vehicleManagementService.searchVehicleBytuition(tuition);
        if (vehicle == null) {
            return "Vehicle not found";
        }
        if (vehicle.isState()) {
            return "The vehicle is already rented";
        }
        vehicle.rent();
        return "Successfully rented vehicle";
    }


    @PostMapping("/return/{tuition}")
    public String returnVehicle(@PathVariable String tuition, @RequestParam int kmFinal) {
        AbstractVehicle vehicle = vehicleManagementService.(tuition);
        if (vehicle == null) {
            return "Vehicle not found";
        }
        if (!vehicle.isState()) {
            return "The vehicle is not rented";
        }
        vehicle.return(kmFinal);
        return "Vehicle returned successfully";
    }

    @GetMapping("/vehicle/count")
    public String countVehicle(@RequestParam int colorCode) {
        return vehicleManagementService.countVehiclesByColor(colorCode);
    }
}
