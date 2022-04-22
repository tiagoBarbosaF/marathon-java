package tiagobarbosa.marathonjava.javacore.Bintroductionmethods.domain;

public class AverageSalary {
    public double[] Salary;

    public AverageSalary(double[] salary) {
        Salary = salary;
    }

    public void avgSalary() {
        double avg = 0;
        for (double salary :
                this.Salary) {
            avg += salary;
        }
        avg /= this.Salary.length;
        System.out.println("Average salary: " + avg);
    }
}
