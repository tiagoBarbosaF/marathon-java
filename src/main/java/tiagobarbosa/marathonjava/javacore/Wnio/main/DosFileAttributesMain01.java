package tiagobarbosa.marathonjava.javacore.Wnio.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesMain01 {
    public static void main(String[] args) {
        Path path = Paths.get("folder/test.txt");

        if (Files.notExists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println("Is hidden -> " + dosFileAttributes.isHidden());
            System.out.println("Is read only -> " + dosFileAttributes.isReadOnly());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        try {
            fileAttributeView.setHidden(true);
            fileAttributeView.setReadOnly(true);
            System.out.println("Is hidden -> " + fileAttributeView.readAttributes().isHidden());
            System.out.println("Is read only -> " + fileAttributeView.readAttributes().isReadOnly());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
