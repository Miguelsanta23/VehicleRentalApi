package co.edu.umanizales.vehicle_rental.model;

import lombok.Getter;

@Getter
public class Car extends AbstractVehicle {

    private boolean extras;

    public Car(String tuition, int km, boolean status, double rentalValue, boolean extras) {
        super(tuition, km, status, rentalValue);
        this.extras = extras;
    }

    @Override
    public void rent() {

    }

    @Override
    public String showData() {
        return "";
    }

    @Override
    public void calculateRoute(int kmFinal, short numDays) {

    }

    @Override
    public double calculateRentalValue(int km) {
        return 0;
    }
}
