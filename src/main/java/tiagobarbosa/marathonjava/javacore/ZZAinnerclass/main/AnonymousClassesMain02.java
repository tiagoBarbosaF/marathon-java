package tiagobarbosa.marathonjava.javacore.ZZAinnerclass.main;

import tiagobarbosa.marathonjava.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesMain02 {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>(List.of(new Car("Gol"), new Car("Fusca")));
        carList.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        carList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        System.out.println(carList);
    }
}
