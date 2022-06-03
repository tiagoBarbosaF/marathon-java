package tiagobarbosa.marathonjava.javacore.ZZClambdas.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

// Reference to an instance method of an arbitrary object of a particular type
public class MethodReferenceMain03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("One Piece", "Hellsing", "Berserk"));
        list.sort(String::compareTo);
        System.out.println("String compareTo -> " + list);
        System.out.println("-------------------------------------");

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println("Function<String, Integer> (\"10\") -> " + numStringToInteger.apply("10"));
        System.out.println("-------------------------------------");

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println("BiPredicate<List<String> (checkName = Berserk) -> " + checkName.test(list, "Berserk"));
    }
}
