package tiagobarbosa.marathonjava.javacore.Labstractclasses.domain;

public class Developer extends Employee{
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonus() {
        this.salary = this.salary + this.salary * 0.15;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
