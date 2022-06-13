package tiagobarbosa.marathonjava.javacore.Wnio.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesMain01 {
    public static void main(String[] args) {
        Path path = Paths.get("/home/tiagobarbosa/dev/file.txt");
        try {
            PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
            System.out.println(posixFileAttributes.permissions());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        PosixFileAttributeView fileAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rw-rw-rw-");
        try {
            fileAttributeView.setPermissions(posixFilePermissions);
            System.out.println(fileAttributeView.readAttributes().permissions());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
