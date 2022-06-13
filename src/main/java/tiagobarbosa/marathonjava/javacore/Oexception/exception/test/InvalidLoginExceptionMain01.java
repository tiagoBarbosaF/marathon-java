package tiagobarbosa.marathonjava.javacore.Oexception.exception.test;

import tiagobarbosa.marathonjava.javacore.Oexception.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionMain01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (InvalidLoginException e) {
            throw new RuntimeException(e);
        }
    }

    private static void login() throws InvalidLoginException {
        Scanner scanner = new Scanner(System.in);
        String userDB = "Tiago";
        String passwordDB = "12345";
        System.out.print("User: ");
        String userTyped = scanner.nextLine();
        System.out.print("Password: ");
        String passwordTyped = scanner.nextLine();

        if (!userDB.equals(userTyped)){
            if (!passwordDB.equals(passwordTyped)){
                throw new InvalidLoginException("Password invalid.");
            }
            throw new InvalidLoginException("User or password invalid");
        }

        System.out.println("Login successfully");
    }


}
