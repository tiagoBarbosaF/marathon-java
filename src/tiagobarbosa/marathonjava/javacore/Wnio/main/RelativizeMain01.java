package tiagobarbosa.marathonjava.javacore.Wnio.main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeMain01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/tiago");
        Path path = Paths.get("/home/tiago/dev/HelloWorld.java");
        Path pathToClazz = dir.relativize(path);
        System.out.println(pathToClazz);

        Path absolute02 = Paths.get("/usr/local");
        Path relative01 = Paths.get("temp");
        Path relative02 = Paths.get("temp/temp.234782346");

        System.out.println("1 -> " + dir.relativize(path));
        System.out.println("2 -> " + path.relativize(dir));
        System.out.println("3 -> " + dir.relativize(absolute02));
        System.out.println("4 -> " + relative01.relativize(relative02));
        System.out.println("5 -> " + dir.relativize(relative01));
    }
}
