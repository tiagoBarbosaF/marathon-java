package tiagobarbosa.marathonjava.javacore.ZZEstreams.main;

import tiagobarbosa.marathonjava.javacore.ZZEstreams.domain.Category;
import tiagobarbosa.marathonjava.javacore.ZZEstreams.domain.LightNovel;
import tiagobarbosa.marathonjava.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMain14 {
    private static List<LightNovel> lightNovels = new ArrayList(List.of(
            new LightNovel("The Begginer after the end", 8.99, Category.FANTASY),
            new LightNovel("A Certain Magical Index", 2.99, Category.FANTASY),
            new LightNovel("Maburaho", 6.99, Category.FANTASY),
            new LightNovel("Blood+", 9.99, Category.DRAMA),
            new LightNovel("Listen to Me, Girls. I Am Your Father!", 3.99, Category.ROMANCE),
            new LightNovel("Durarara!!", 1.99, Category.DRAMA),
            new LightNovel("Durarara!!", 1.99, Category.DRAMA),
            new LightNovel("Record of Lodoss War", 7.99, Category.FANTASY),
            new LightNovel("Haiyore! Nyaruko-san", 4.00, Category.ROMANCE),
            new LightNovel("Sword Art Online", 12.99, Category.FANTASY)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);
        System.out.println();

        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);
        System.out.println();

        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);
        System.out.println();

        Map<Category, LightNovel> collect3 = lightNovels.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        for (Map.Entry<Category, LightNovel> entry : collect3.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("Title: "+entry.getValue().getTitle()+", Price: "+entry.getValue().getPrice());
        }

    }
}
