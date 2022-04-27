package tiagobarbosa.marathonjava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionMain02 {
    public static void main(String[] args) {
        try {
            createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void createNewFile() throws IOException {
        File file = new File("files\\test.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created - " + isCreated);
        } catch (IOException e) {
            System.out.println("Error - " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }
}
