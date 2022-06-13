package tiagobarbosa.marathonjava.javacore.Hheritage.main;

import tiagobarbosa.marathonjava.javacore.Hheritage.domain.Address;
import tiagobarbosa.marathonjava.javacore.Hheritage.domain.Employee;

public class HeritageMain01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Street 01");
        address.setZipcode("12345-567");

        Employee employee = new Employee("Tiago Barbosa","123456789-09",7000);
        employee.setAddress(address);

        employee.print();
        System.out.println();
        employee.paymentReport();
    }
}
