package tiagobarbosa.marathonjava.javacore.Labstractclasses.domain;

public abstract class Employee extends Person{
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculateBonus();
    }

    @Override
    public void print() {
        System.out.println("Name: "+this.name);
        System.out.println("Salary: "+this.salary);
    }

    public abstract void calculateBonus();
}
