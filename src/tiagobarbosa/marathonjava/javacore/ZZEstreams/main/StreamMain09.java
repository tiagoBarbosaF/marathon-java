package tiagobarbosa.marathonjava.javacore.ZZEstreams.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain09 {
    public static void main(String[] args) {
        System.out.print("IntStream.rangeClosed %2 (1,50) -> ");
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.print("\nIntStream.range %2 (1,50) -> ");
        IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));

        System.out.println("------------------------------------------------");

        Stream.of("Testing ", "Stream", ".of").map(String::toUpperCase).forEach(System.out::print);

        System.out.println("\n------------------------------------------------");
        int[] num = {1, 2, 3, 4, 5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        System.out.println("\n------------------------------------------------");

        try (Stream<String> lines = Files.lines(Paths.get("folder/file.txt"))) {
            lines.filter(l -> l.contains("Java")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
