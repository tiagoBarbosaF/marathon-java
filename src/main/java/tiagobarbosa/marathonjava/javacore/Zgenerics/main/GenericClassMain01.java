package tiagobarbosa.marathonjava.javacore.Zgenerics.main;

import tiagobarbosa.marathonjava.javacore.Zgenerics.domain.Car;
import tiagobarbosa.marathonjava.javacore.Zgenerics.service.RentalCarService;

public class GenericClassMain01 {
    public static void main(String[] args) {
        RentalCarService rentalCarService = new RentalCarService();
        Car car = rentalCarService.searchAvailableCar();
        System.out.println("\nUsing car for one month ...");
        rentalCarService.returnAvailableCar(car);
    }
}
