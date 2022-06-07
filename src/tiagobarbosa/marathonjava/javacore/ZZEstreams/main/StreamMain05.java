package tiagobarbosa.marathonjava.javacore.ZZEstreams.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain05 {
    public static void main(String[] args) {
        List<String> words = List.of("Banana", "Apple", "Pineapple", "Orange");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List<String> letters2 = words.stream().map(w -> w.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(letters2);

    }
}
