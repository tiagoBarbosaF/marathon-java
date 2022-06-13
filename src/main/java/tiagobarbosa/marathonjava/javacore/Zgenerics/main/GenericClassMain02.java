package tiagobarbosa.marathonjava.javacore.Zgenerics.main;

import tiagobarbosa.marathonjava.javacore.Zgenerics.domain.Boat;
import tiagobarbosa.marathonjava.javacore.Zgenerics.domain.Car;
import tiagobarbosa.marathonjava.javacore.Zgenerics.service.RentalBoatService;

public class GenericClassMain02 {
    public static void main(String[] args) {
        RentalBoatService rentalBoatService = new RentalBoatService();
        Boat boat = rentalBoatService.searchAvailableBoat();
        System.out.println("\nUsing boat for one month ...");
        rentalBoatService.returnAvailableBoat(boat);
    }
}
