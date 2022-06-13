package tiagobarbosa.marathonjava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionMain01 {
    public static void main(String[] args) {
        createNewFile();
    }

    public static void createNewFile(){
        File file = new File("files\\test.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created - "+isCreated);
        }catch (IOException e){
            System.out.println("Error - "+e.getMessage());
            e.printStackTrace();
        }
    }
}
