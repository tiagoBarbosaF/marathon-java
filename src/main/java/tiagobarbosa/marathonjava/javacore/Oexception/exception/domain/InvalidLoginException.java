package tiagobarbosa.marathonjava.javacore.Oexception.exception.domain;

public class InvalidLoginException extends Exception{
    public InvalidLoginException() {
        System.out.println("Invalid login");
    }

    public InvalidLoginException(String message) {
        super(message);
    }
}
