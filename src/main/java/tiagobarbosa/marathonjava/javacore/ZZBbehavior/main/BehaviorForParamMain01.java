package tiagobarbosa.marathonjava.javacore.ZZBbehavior.main;

import tiagobarbosa.marathonjava.javacore.ZZBbehavior.domain.Car;

import java.nio.file.LinkOption;
import java.util.ArrayList;
import java.util.List;

public class BehaviorForParamMain01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2018));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println("---------------------");
        System.out.println(filterByColor(cars, "red"));
        System.out.println("---------------------");
        System.out.println(filteredYearBeforeCar(cars, 2013));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterByColor(List<Car> cars, String color) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filteredYearBeforeCar(List<Car> cars, int year) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
