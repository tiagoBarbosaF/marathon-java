package tiagobarbosa.marathonjava.javacore.ZZEstreams.main;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMain10 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(a -> System.out.print(Arrays.toString(a) + " "));
        System.out.println();
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(a -> System.out.print(a + " "));
    }
}
