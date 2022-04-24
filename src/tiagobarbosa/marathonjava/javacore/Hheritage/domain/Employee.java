package tiagobarbosa.marathonjava.javacore.Hheritage.domain;

public class Employee extends Person {
    private double salary;

    public Employee(String name, String document, double salary) {
        super(name, document);
        this.salary = salary;
    }

    public void print() {
        System.out.println("== Employee ==");
        super.print();
        System.out.println("Salary: " + this.salary);
    }

    public void paymentReport(){
        System.out.println("I "+this.name+", receive "+this.salary+" in my salary.");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
