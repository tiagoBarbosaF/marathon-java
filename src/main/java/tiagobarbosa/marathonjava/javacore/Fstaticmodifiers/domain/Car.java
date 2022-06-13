package tiagobarbosa.marathonjava.javacore.Fstaticmodifiers.domain;

public class Car {
    private String name;
    private double maxVelocity;
    private static double limitVelocity = 250;

    public Car(String name, double maxVelocity) {
        this.name = name;
        this.maxVelocity = maxVelocity;
    }

    public void print() {
        System.out.println("Car -> Name: " + this.name + ", Max velocity: " + this.maxVelocity + ", Limit velocity: " + Car.limitVelocity);
    }

    public static void setLimitVelocity(double limitVelocity){
        Car.limitVelocity = limitVelocity;
    }

    public double getLimitVelocity(){
        return Car.limitVelocity;
    }
}
