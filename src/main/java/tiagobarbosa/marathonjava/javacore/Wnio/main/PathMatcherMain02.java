package tiagobarbosa.marathonjava.javacore.Wnio.main;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllMainJavaOrClass extends SimpleFileVisitor<Path>{
    private final PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Main*}.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (matcher.matches(file)){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherMain02 {
    public static void main(String[] args) {
        Path root = Paths.get(".");
        try {
            Files.walkFileTree(root, new FindAllMainJavaOrClass());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
