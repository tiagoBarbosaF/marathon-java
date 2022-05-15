package tiagobarbosa.marathonjava.javacore.Vio.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterMain01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\tiago\\dev\\java\\marathon-java\\files\\file.txt");

        try (FileWriter fileWriter = new FileWriter(file, true)) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write("Testing writing a file using FileWriter class.");
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
