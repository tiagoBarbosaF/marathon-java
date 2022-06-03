package tiagobarbosa.marathonjava.javacore.Zgenerics.service;

import tiagobarbosa.marathonjava.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class RentalBoatService {
    private List<Boat> availableBoats = new ArrayList<>(List.of(new Boat("Speedboat"), new Boat("Yacht")));

    public Boat searchAvailableBoat() {
        System.out.println("Searching available boat ...");
        Boat boat = availableBoats.remove(0);
        System.out.println("Renting boat: " + boat);
        System.out.println("Available cars for rent:");
        System.out.println(availableBoats);
        return boat;
    }

    public void returnAvailableBoat(Boat boat) {
        System.out.println("Returning boat: " + boat);
        availableBoats.add(boat);
        System.out.println("Available cars for rent: ");
        System.out.println(availableBoats);
    }
}
