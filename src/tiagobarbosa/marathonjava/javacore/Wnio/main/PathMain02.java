package tiagobarbosa.marathonjava.javacore.Wnio.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathMain02 {
    public static void main(String[] args) {
        Path folderPath = Paths.get("folder");
        try {
            if (Files.notExists(folderPath)) {
                System.out.println("Directory created -> " + Files.createDirectory(folderPath));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Path subFolderPath = Paths.get("folder/subfolder/subsubfolder");
        try {
            System.out.println("Directories created -> " + Files.createDirectories(subFolderPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Path filePath = Paths.get(subFolderPath.toString(), "filetest.txt");
        if (Files.notExists(filePath)) {
            try {
                System.out.println("File created -> " + Files.createFile(filePath));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        Path target = Paths.get(filePath.getParent().toString(), "filetest_renamed.txt");
        try {
            System.out.println("File copied -> " + Files.copy(filePath, target, StandardCopyOption.REPLACE_EXISTING));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
