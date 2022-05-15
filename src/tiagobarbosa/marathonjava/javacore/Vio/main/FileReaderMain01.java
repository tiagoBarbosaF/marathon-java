package tiagobarbosa.marathonjava.javacore.Vio.main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\tiago\\dev\\java\\marathon-java\\files\\file.txt");

        try (FileReader fileReader = new FileReader(file)) {
//            char[] in = new char[40];
//            fileReader.read(in);
//            for (char c : in) {
//                System.out.print(c);
//            }
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
