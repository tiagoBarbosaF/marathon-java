package tiagobarbosa.marathonjava.javacore.Bintroductionmethods.domain;

public class AverageSalary {
    private double[] Salary;
    private double Average;

    public AverageSalary(double[] salary) {
        Salary = salary;
    }

    public double[] getSalary() {
        return Salary;
    }

    public double getAverage() {
        return Average;
    }

    public void avgSalary() {
        for (double salary :
                this.Salary) {
            Average += salary;
        }
        Average /= this.Salary.length;
        System.out.println("Average salary: " + Average);
    }
}
