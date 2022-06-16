package tiagobarbosa.marathonjava.javacore.ZZKjunit.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tiagobarbosa.marathonjava.javacore.ZZKjunit.domain.Person;

import java.util.List;

class PersonServiceTest {
    private Person adult;
    private Person notAdult;
    private PersonService personService;

    @BeforeEach
    public void setUp() {
        personService = new PersonService();
        adult = new Person(18);
        notAdult = new Person(15);
    }

    @Test
    @DisplayName("A person should be not adult when age is lower than eighteen")
    void isAdult_ReturnFalse_WhenAgeIsLowerThanEighteen() {
        Assertions.assertFalse(personService.isAdult(notAdult));
    }

    @Test
    @DisplayName("A person should be adult when age is greater or equal than eighteen")
    void isAdult_ReturnTrue_WhenAgeIsGreaterOrEqualThanEighteen() {
        Assertions.assertTrue(personService.isAdult(adult));
    }

    @Test
    @DisplayName("Should throw NullPointException with message when person is null")
    void isAdult_TrowException_WhenPersonIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> personService.isAdult(null));
    }

    @Test
    @DisplayName("Should return list with only adults")
    void filterRemovingNotAdult_ReturnListWithAdultOnly_WhenListOfPersonWithAdultIsPassed() {
        Person person1 = new Person(17);
        Person person2 = new Person(18);
        Person person3 = new Person(21);
        List<Person> personList = List.of(person1, person2, person3);
        Assertions.assertEquals(2, personService.filterRemovingNotAdult(personList).size());
    }
}