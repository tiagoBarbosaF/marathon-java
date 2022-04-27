package tiagobarbosa.marathonjava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionMain04 {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();
        } catch (IllegalArgumentException e) {
            System.out.println("Inside of IllegalArgumentException exception");
        } catch (ArithmeticException e) {
            System.out.println("Inside of ArithmeticException exception");
        } catch (RuntimeException e) {
            System.out.println("Inside of RuntimeException exception");
        }

        try {
            maybeLaunchException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void maybeLaunchException() throws SQLException, FileNotFoundException{

    }
}
