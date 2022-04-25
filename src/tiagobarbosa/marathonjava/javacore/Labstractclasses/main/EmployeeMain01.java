package tiagobarbosa.marathonjava.javacore.Labstractclasses.main;

import tiagobarbosa.marathonjava.javacore.Labstractclasses.domain.Developer;
import tiagobarbosa.marathonjava.javacore.Labstractclasses.domain.Manager;

public class EmployeeMain01 {
    public static void main(String[] args) {
        Manager manager = new Manager("John Snow", 5000);
        Developer developer = new Developer("Tiago Barbosa", 12000);

        System.out.println(manager);
        System.out.println(developer);

        manager.print();
        developer.print();
    }
}
