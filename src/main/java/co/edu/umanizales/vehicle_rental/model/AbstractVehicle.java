package co.edu.umanizales.vehicle_rental.model;

import lombok.Getter;

@Getter
public abstract class AbstractVehicle implements VehicleAble{

    private String tuition; // Matricula
    private int km; //Kilometros
    private boolean status; //Estado
    private double rentalValue; //Valor alquiler

    public AbstractVehicle(String tuition, int km, boolean status, double rentalValue) {
        this.tuition = tuition;
        this.km = km;
        this.status = status;
        this.rentalValue = rentalValue;
    }

    public AbstractVehicle() {
    }

    public abstract double calculateRentalValue(int km);




}
