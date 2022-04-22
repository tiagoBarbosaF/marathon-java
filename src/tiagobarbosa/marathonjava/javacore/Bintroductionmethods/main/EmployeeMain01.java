package tiagobarbosa.marathonjava.javacore.Bintroductionmethods.main;

import tiagobarbosa.marathonjava.javacore.Bintroductionmethods.domain.Employee;

public class EmployeeMain01 {
    public static void main(String[] args) {
        Employee employee = new Employee("Tiago Barbosa", 36, new double[]{7000, 7550.50, 9560.90, 12560.89});

        System.out.println("\n== Employee ==");
        employee.print();
    }
}
