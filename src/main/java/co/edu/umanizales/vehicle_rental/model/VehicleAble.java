package co.edu.umanizales.vehicle_rental.model;

public interface VehicleAble {

    void rent();

    String showData();

    void calculateRoute(int kmFinal, short numDays);

    double calculateRentalValue(int km);
}