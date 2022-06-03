package tiagobarbosa.marathonjava.javacore.ZZBbehavior.main;

import tiagobarbosa.marathonjava.javacore.ZZBbehavior.domain.Car;
import tiagobarbosa.marathonjava.javacore.ZZBbehavior.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class BehaviorForParamMain02 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2018));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearBeforeCar = filter(cars, car -> car.getYear() < 2013);
        System.out.println("Green cars -> " + greenCars);
        System.out.println("Red cars -> " + redCars);
        System.out.println("Year before cars -> " + yearBeforeCar);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.Test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
