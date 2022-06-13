package tiagobarbosa.marathonjava.javacore.Oexception.exception.test;

import tiagobarbosa.marathonjava.javacore.Oexception.exception.domain.Employee;
import tiagobarbosa.marathonjava.javacore.Oexception.exception.domain.InvalidLoginException;
import tiagobarbosa.marathonjava.javacore.Oexception.exception.domain.Person;

public class OverloadWithExceptionMain01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            employee.save();
        } catch (InvalidLoginException e) {
            throw new RuntimeException(e);
        }
    }
}
