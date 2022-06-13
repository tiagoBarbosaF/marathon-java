package tiagobarbosa.marathonjava.javacore.Bintroductionmethods.domain;

public class Employee extends AverageSalary {
    private String Name;
    private int Age;

    public Employee(String name, int age, double[] salary) {
        super(salary);
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public void print() {
        System.out.println("Employee -> Name: " + this.Name + ", Age: " + this.Age);
        for (int i = 0; i < this.getSalary().length; i++) {
            System.out.println("Salary " + (i + 1) + ": " + this.getSalary()[i]);
        }
        avgSalary();
    }
}
