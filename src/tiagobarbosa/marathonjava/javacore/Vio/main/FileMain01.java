package tiagobarbosa.marathonjava.javacore.Vio.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.ZoneId;

public class FileMain01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\tiago\\dev\\java\\marathon-java\\files\\file.txt");

        try {
            System.out.println("Path file created -> " + file.getAbsolutePath());
            System.out.println("File is created -> " + file.getName() + " - " + file.createNewFile());
            BasicFileAttributes basicFileAttributes = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
            System.out.println("Is a directory? " + basicFileAttributes.isDirectory());
            System.out.println("Is a file? " + basicFileAttributes.isRegularFile());
            System.out.println("Is a hidden file? " + file.isHidden());
            System.out.println("Last modified -> " + basicFileAttributes.lastModifiedTime().toInstant().atZone(ZoneId.systemDefault()));

            if (file.exists()) {
                System.out.println("File deleted -> " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
