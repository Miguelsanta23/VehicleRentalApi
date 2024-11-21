package co.edu.umanizales.vehicle_rental.model;

public class Motorbike extends AbstractVehicle {

    private boolean helmet; //Casco

    public Motorbike(String tuition, int km, boolean status, double rentalValue, boolean helmet) {
        super(tuition, km, status, rentalValue);
        this.helmet = helmet;
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
