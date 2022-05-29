package tiagobarbosa.marathonjava.javacore.Ycollections.main;

import java.util.ArrayList;
import java.util.List;

public class ListMain01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        names.add("Tiago");
        names.add("Barbosa");
        names2.add("Peter");
        names2.add("Mendonça");

        names.addAll(names2);

        System.out.println(names);
        System.out.println(names2);

        for (String name : names) {
            System.out.println(name);
        }

        names.add("Farias");
        System.out.println("-------------------------");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

    }
}
