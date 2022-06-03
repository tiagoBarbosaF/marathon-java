package tiagobarbosa.marathonjava.javacore.Zgenerics.service;

import tiagobarbosa.marathonjava.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RentalCarService {
    private List<Car> availableCars = new ArrayList<>(List.of(new Car("New Fiesta"), new Car("Gol")));

    public Car searchAvailableCar() {
        System.out.println("Searching available car ...");
        Car car = availableCars.remove(0);
        System.out.println("Renting car: " + car);
        System.out.println("Available cars for rent:");
        System.out.println(availableCars);
        return car;
    }

    public void returnAvailableCar(Car car) {
        System.out.println("Returning car: " + car);
        availableCars.add(car);
        System.out.println("Available cars for rent: ");
        System.out.println(availableCars);
    }
}
