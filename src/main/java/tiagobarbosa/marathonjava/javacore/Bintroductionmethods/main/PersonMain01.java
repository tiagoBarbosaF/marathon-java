package tiagobarbosa.marathonjava.javacore.Bintroductionmethods.main;

import tiagobarbosa.marathonjava.javacore.Bintroductionmethods.domain.Person;

public class PersonMain01 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Tiago");
        person.setAge(36);
        person.print();

        System.out.println("\n== Using gets ==");
        System.out.println("Person -> Name: " + person.getName() + ", Age: " + person.getAge());
    }
}
