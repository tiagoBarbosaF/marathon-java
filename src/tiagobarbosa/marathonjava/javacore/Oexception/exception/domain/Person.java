package tiagobarbosa.marathonjava.javacore.Oexception.exception.domain;

import java.io.IOException;

public class Person {
    public void save() throws InvalidLoginException, IOException{
        System.out.println("Person saved.");
    }
}
