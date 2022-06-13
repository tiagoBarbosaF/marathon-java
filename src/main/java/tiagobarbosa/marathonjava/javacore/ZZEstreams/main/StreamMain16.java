package tiagobarbosa.marathonjava.javacore.ZZEstreams.main;

import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.lang.System.currentTimeMillis;

public class StreamMain16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000;
        sumFor(num);
        System.out.println("---------------------------------");
        sumStreamIterate(num);
        System.out.println("---------------------------------");
        sumParallelStreamIterate(num);
        System.out.println("---------------------------------");
        sumLongStreamIterate(num);
        System.out.println("---------------------------------");
        sumParallelLongStreamIterate(num);
    }

    private static void sumFor(long num) {
        System.out.println("Sum sumFor");
        long result = 0;
        long init = currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += i;
        }
        long end = currentTimeMillis();
        System.out.println(result + " -> " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num) {
        System.out.println("Sum sumStreamIterate");
        long init = currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = currentTimeMillis();
        System.out.println(result + " -> " + (end - init) + "ms");
    }

    private static void sumParallelStreamIterate(long num) {
        System.out.println("Sum sumParallelStreamIterate");
        long init = currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = currentTimeMillis();
        System.out.println(result + " -> " + (end - init) + "ms");
    }

    private static void sumLongStreamIterate(long num) {
        System.out.println("Sum sumLongStreamIterate");
        long init = currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = currentTimeMillis();
        System.out.println(result + " -> " + (end - init) + "ms");
    }

    private static void sumParallelLongStreamIterate(long num) {
        System.out.println("Sum sumParallelLongStreamIterate");
        long init = currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = currentTimeMillis();
        System.out.println(result + " -> " + (end - init) + "ms");
    }
}
