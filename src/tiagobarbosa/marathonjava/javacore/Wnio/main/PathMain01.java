package tiagobarbosa.marathonjava.javacore.Wnio.main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMain01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\tiago\\dev\\java\\marathon-java\\folder\\file.txt");
        Path p2 = Paths.get("C:\\Users\\tiago\\dev\\java\\marathon-java\\folder", "file.txt");
        Path p3 = Paths.get("C:","Users\\tiago\\dev\\java\\marathon-java\\folder", "file.txt");
        Path p4 = Paths.get("C:",
                "Users",
                "tiago",
                "dev",
                "java",
                "marathon-java",
                "folder",
                "file.txt");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
