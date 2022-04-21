package tiagobarbosa.marathonjava.javacore.Aintroductionclasses.main;

import tiagobarbosa.marathonjava.javacore.Aintroductionclasses.domain.Car;

public class CarMain01 {
    public static void main(String[] args) {

        Car car01 = new Car();
        Car car02 = new Car();

        car01.Name = "Fusca";
        car01.Model = "Ret";
        car01.Year = 1980;

        car02.Name = "Uno";
        car02.Model = "Ret";
        car02.Year = 2000;

        car01 = car02;

        System.out.println("== Cars ==");
        System.out.println("Name: " + car01.Name + ", Model: " + car01.Model + ", Year: " + car01.Year);
        System.out.println("Name: " + car02.Name + ", Model: " + car02.Model + ", Year: " + car02.Year);
    }
}
