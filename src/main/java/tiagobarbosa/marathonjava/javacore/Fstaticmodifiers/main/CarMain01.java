package tiagobarbosa.marathonjava.javacore.Fstaticmodifiers.main;

import tiagobarbosa.marathonjava.javacore.Fstaticmodifiers.domain.Car;

public class CarMain01 {
    public static void main(String[] args) {
        Car car01 = new Car("Mercedes", 290);
        Car car02 = new Car("BMW", 320);

        Car.setLimitVelocity(180);

        car01.print();
        car02.print();
    }
}
