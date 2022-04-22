package tiagobarbosa.marathonjava.javacore.Bintroductionmethods.domain;

public class Employee extends AverageSalary {
    public Employee(String name, int age, double[] salary) {
        super(salary);
        Name = name;
        Age = age;
    }

    public String Name;
    public int Age;

    public void print() {
        System.out.println("Employee -> Name: " + this.Name + ", Age: " + this.Age);
        for (int i = 0; i < this.Salary.length; i++) {
            System.out.println("Salary " + (i + 1) + ": " + this.Salary[i]);
        }
        avgSalary();
    }

}
