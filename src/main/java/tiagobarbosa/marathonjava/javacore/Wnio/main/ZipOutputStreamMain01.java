package tiagobarbosa.marathonjava.javacore.Wnio.main;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamMain01 {
    public static void main(String[] args) {
        Path filesZip = Paths.get("folder/files.zip");
        Path filesForZip = Paths.get("folder/subfolder01/subsubfolder01");
        zip(filesZip, filesForZip);
    }

    private static void zip(Path fileZip, Path filesForZip) {
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(fileZip))) {
            try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(filesForZip)) {
                for (Path file : directoryStream) {
                    ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                    zipOutputStream.putNextEntry(zipEntry);
                    Files.copy(file, zipOutputStream);
                    zipOutputStream.closeEntry();
                }
                System.out.println("File zip created with successfully");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
