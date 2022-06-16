package tiagobarbosa.marathonjava.javacore.ZZKjunit.service;

import tiagobarbosa.marathonjava.javacore.ZZKjunit.domain.Person;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PersonService {
    public boolean isAdult(Person person) {
//        Objects.requireNonNull(person, "Person can't be null");
        if (person == null) {
            throw new IllegalArgumentException();
        }
        return person.getAge() >= 18;
    }

    public List<Person> filterRemovingNotAdult(List<Person> personList) {
        return personList.stream().filter(this::isAdult).collect(Collectors.toList());
    }
}
