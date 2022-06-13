package tiagobarbosa.marathonjava.javacore.Zgenerics.main;

import tiagobarbosa.marathonjava.javacore.Zgenerics.domain.Boat;
import tiagobarbosa.marathonjava.javacore.Zgenerics.domain.Car;
import tiagobarbosa.marathonjava.javacore.Zgenerics.service.RentalBoatService;
import tiagobarbosa.marathonjava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassMain03 {
    public static void main(String[] args) {
        List<Car> availableCars = new ArrayList<>(List.of(new Car("New Fiesta"), new Car("Gol")));
        List<Boat> availableBoats = new ArrayList<>(List.of(new Boat("Speedboat"), new Boat("Yacht")));

        RentalService<Car> rentalServiceCar = new RentalService<>(availableCars);
        Car car = rentalServiceCar.searchAvailableVehicles();
        System.out.println("Using the vehicle for one month ...");
        rentalServiceCar.returnAvailableVehicle(car);

        System.out.println("-----------------------------------------");

        RentalService<Boat> rentalServiceBoat = new RentalService<>(availableBoats);
        Boat boat = rentalServiceBoat.searchAvailableVehicles();
        System.out.println("Using the vehicle for one month ...");
        rentalServiceBoat.returnAvailableVehicle(boat);
    }
}
