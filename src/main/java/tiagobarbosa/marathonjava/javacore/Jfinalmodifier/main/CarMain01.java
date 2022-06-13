package tiagobarbosa.marathonjava.javacore.Jfinalmodifier.main;

import tiagobarbosa.marathonjava.javacore.Jfinalmodifier.domain.Car;
import tiagobarbosa.marathonjava.javacore.Jfinalmodifier.domain.Ferrari;

public class CarMain01 {
    public static void main(String[] args) {
        Car car = new Car("BMW");

        System.out.println(Car.SPEED_LIMIT);
        System.out.println(car.BUYER);
        car.BUYER.setName("Tiago Barbosa");
        System.out.println(car.BUYER);

        System.out.println("==Ferrari==");
        Ferrari ferrari = new Ferrari("Enzo");
        ferrari.print();
    }
}
