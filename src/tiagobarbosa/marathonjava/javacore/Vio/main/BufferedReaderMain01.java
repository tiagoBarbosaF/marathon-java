package tiagobarbosa.marathonjava.javacore.Vio.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderMain01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\tiago\\dev\\java\\marathon-java\\files\\file.txt");

        try (FileReader fileReader = new FileReader(file)) {
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String line;
                while ((line = bufferedReader.readLine())!= null){
                    System.out.println(line);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
