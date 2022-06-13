package tiagobarbosa.marathonjava.javacore.Vio.main;

import java.io.File;
import java.io.IOException;

public class FileMain02 {
    public static void main(String[] args) {
        File directory = new File("folder");
        System.out.println("Folder created?");
        System.out.println(directory.mkdir());

        File fileDirectory = new File(directory, "file.txt");
        System.out.println("File created?");
        try {
            System.out.println(fileDirectory.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File fileRenamed = new File(directory, "file_02.txt");
        System.out.println("File renamed?");
        System.out.println(fileDirectory.renameTo(fileRenamed));

        File directoryRenamed = new File("folder02");
        System.out.println("Directory renamed?");
        System.out.println(directory.renameTo(directoryRenamed));
    }
}
