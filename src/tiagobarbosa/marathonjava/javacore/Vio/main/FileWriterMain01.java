package tiagobarbosa.marathonjava.javacore.Vio.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\tiago\\dev\\java\\marathon-java\\files\\file.txt");

        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("Testing writing a file using FileWriter class.\n");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
