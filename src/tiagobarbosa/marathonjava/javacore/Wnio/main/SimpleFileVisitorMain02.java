package tiagobarbosa.marathonjava.javacore.Wnio.main;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        System.out.println("Pre-visit -> " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
        System.out.println("Post-visit -> " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorMain02 {
    public static void main(String[] args) {
        Path root = Paths.get("folder");
        try {
            Files.walkFileTree(root, new ListAllFiles());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
