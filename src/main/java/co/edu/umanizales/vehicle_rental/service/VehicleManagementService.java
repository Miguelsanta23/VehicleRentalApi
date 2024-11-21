package co.edu.umanizales.vehicle_rental.service;

import co.edu.umanizales.vehicle_rental.model.Car;
import co.edu.umanizales.vehicle_rental.model.Motorbike;
import co.edu.umanizales.vehicle_rental.model.Van;
import org.example.vehicle_rental.model.AbstractVehicle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleManagementService {

    private List<AbstractVehicle> listVehicles = new ArrayList<>();

    public VehiculoService() {
        vehiculos.add(new Motorbike("YOT45F", 5000, true));
        vehiculos.add(new Motorbike("FEO12G", 10000, true));
        vehiculos.add(new Car("COC343", 20000, true));
        vehiculos.add(new Car("MTE123", 40000, true));
        vehiculos.add(new Van("JPO505", 100000, true));
        vehiculos.add(new Van("FTA780", 6000, true));
    }

    public String countVehiclesByColor(int colorCode) {
        int motorbikeCounter = 0;
        int  carCounter= 0;
        int vanCounter = 0;

        for (Vehicle vehicle : vehicle) {
            if (vehicle.getColorCode() == colorCode) {
                if (vehicle instanceof Motorbike) {
                    motorbikeCounter++;
                } else if (vehicle instanceof Car) {
                    carCounter++;
                } else if (vehicle instanceof Van) {
                    vanCounter++;
                }
            }
        }

        return "Motorbike: " + motorbikeCounter + ", Car: " + carCounter + ", Van: " + vanCounter;
    }

    public void registerVehicle(AbstractVehicle vehicles) {
        listVehicles.add(vehicles);

    }

    public List<AbstractVehicle> getVehicles() {
        return listVehicles;
    }

    public AbstractVehicle findVehicleByTuition(String tuition) {
        for (AbstractVehicle vehicle : listVehicles) {
            if (vehicle.getTuition().equals(tuition)) {
                return vehicle;
            }
        }
        return null;
    }
}
