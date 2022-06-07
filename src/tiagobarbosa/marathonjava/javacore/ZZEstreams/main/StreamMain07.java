package tiagobarbosa.marathonjava.javacore.ZZEstreams.main;

import java.sql.SQLOutput;
import java.util.List;

public class StreamMain07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(Integer::sum));

        System.out.println(integers.stream().reduce(0, (x, y) -> x + y));
        System.out.println("Sum list of integers -> " + integers.stream().reduce(0, Integer::sum));

        integers.stream().reduce((x, y) -> x * y).ifPresent(System.out::println);
        System.out.println("Multiple list of integers -> " + integers.stream().reduce(1, (x, y) -> x * y));

        integers.stream().reduce(Integer::max).ifPresent(x -> System.out.println("max integers of the list -> " + x));
        integers.stream().reduce(Integer::min).ifPresent(x -> System.out.println("min integer of the list -> " + x));
    }
}
