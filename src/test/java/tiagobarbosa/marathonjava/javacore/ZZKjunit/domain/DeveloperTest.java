package tiagobarbosa.marathonjava.javacore.ZZKjunit.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeveloperTest {
    private Employee employee;

    @BeforeEach
    public void setUp() {
        employee = new Developer("1", "Java");
    }

    @Test
    public void instanceOf_ExecutesChildClassMethod_WhenObjectIsOfChildType() {
        if (employee instanceof Developer) {
            Developer developer = (Developer) employee;
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }

        if (employee instanceof Developer developer) { // pattern variable
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }
    }
}