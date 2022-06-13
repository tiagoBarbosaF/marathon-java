package tiagobarbosa.marathonjava.javacore.ZZEstreams.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamMain04 {
    public static void main(String[] args) {
        List<List<String>> company = new ArrayList<>();
        List<String> graphicDesigners = List.of("John", "Bob", "Marie");
        List<String> developers = List.of("Tiago", "Peter", "Rakel");
        List<String> students = List.of("Pedro", "Francisco", "Paul");
        company.add(graphicDesigners);
        company.add(developers);
        company.add(students);

        for (List<String> people : company) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("----------------------");

        company.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
