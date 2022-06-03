package tiagobarbosa.marathonjava.javacore.ZZBbehavior.main;

import tiagobarbosa.marathonjava.javacore.ZZBbehavior.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorForParamMain03 {
    private static final List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2018));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> yearBeforeCar = filter(cars, car -> car.getYear() < 2013);
        System.out.println("Green cars -> " + greenCars);
        System.out.println("Red cars -> " + redCars);
        System.out.println("Year before cars -> " + yearBeforeCar);

        System.out.println("-----------------------------------------");
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                filteredList.add(t);
            }
        }
        return filteredList;
    }
}
