package tiagobarbosa.marathonjava.javacore.ZZKjunit.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tiagobarbosa.marathonjava.javacore.ZZKjunit.domain.Person;

class PersonServiceTest {

    @Test
    @DisplayName("A person should be not adult when age is lower than eighteen")
    void isAdult_ReturnFalse_WhenAgeIsLowerThanEighteen() {
        PersonService personService = new PersonService();
        Person person = new Person(15);
        Assertions.assertFalse(personService.isAdult(person));
    }
}