package co.edu.umanizales.vehicle_rental.model;

import java.util.Date;

public class RentalVehicle {
    private AbstractVehicle vehicle;
    private User userRegister;
    private Date rentDate;
    private Date devolutionDate;
    private Customer customer;

    public RentalVehicle(AbstractVehicle vehicle, User userRegister, Date rentDate, Date devolutionDate, Customer customer) {
        this.vehicle = vehicle;
        this.userRegister = userRegister;
        this.rentDate = rentDate;
        this.devolutionDate = devolutionDate;
        this.customer = customer;
    }

    public void rentVehicle(AbstractVehicle vehicle, User userRegister) {
        this.vehicle = vehicle;
        this.userRegister = userRegister;

    }
}
