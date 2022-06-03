package tiagobarbosa.marathonjava.javacore.ZZClambdas.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaMain02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Tiago", "Peter", "Roronoa");
        System.out.println("Map string length -> " + map(strings, s -> s.length()));
        System.out.println("Map string UPPERCASE -> " + map(strings, s -> s.toUpperCase()));
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
