package tiagobarbosa.marathonjava.javacore.Zgenerics.service;

import java.util.List;

public class RentalService<T> {
    private List<T> availableVehicles;

    public RentalService(List<T> availableVehicles){
        this.availableVehicles = availableVehicles;
    }

    public T searchAvailableVehicles() {
        System.out.println("Searching available vehicle ...");
        T t = availableVehicles.remove(0);
        System.out.println("Renting vehicle: " + t);
        System.out.println("Available vehicle for rent:");
        System.out.println(availableVehicles);
        return t;
    }

    public void returnAvailableVehicle(T t) {
        System.out.println("Returning vehicle: " + t);
        availableVehicles.add(t);
        System.out.println("Available vehicle for rent: ");
        System.out.println(availableVehicles);
    }
}
