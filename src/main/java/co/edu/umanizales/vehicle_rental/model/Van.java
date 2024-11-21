package co.edu.umanizales.vehicle_rental.model;

public class Van extends AbstractVehicle {
    private short capacity;

    public Van(String tuition, int km, boolean status, double rentalValue, short capacity) {
        super(tuition, km, status, rentalValue);
        this.capacity = capacity;
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
