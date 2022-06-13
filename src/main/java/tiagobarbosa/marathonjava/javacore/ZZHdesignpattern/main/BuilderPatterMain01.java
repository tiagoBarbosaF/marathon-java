package tiagobarbosa.marathonjava.javacore.ZZHdesignpattern.main;

import tiagobarbosa.marathonjava.javacore.ZZHdesignpattern.domain.Person;

public class BuilderPatterMain01 {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .firstName("Tiago")
                .lastName("Barbosa")
                .username("tiago")
                .email("tiago@gmail.com")
                .build();
        System.out.println(person);
    }
}
