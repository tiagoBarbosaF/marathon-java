package tiagobarbosa.marathonjava.javacore.ZZDoptional.main;

import java.util.List;
import java.util.Optional;

public class OptionalMain01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Test");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("--------------");

        Optional<String> name = findName("Tiago");
        String empty = name.orElse("EMPTY");
        System.out.println(name);
        name.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("Tiago", "Barbosa");
        int i = list.indexOf(name);
        if (i != -1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
