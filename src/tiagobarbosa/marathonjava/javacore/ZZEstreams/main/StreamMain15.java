package tiagobarbosa.marathonjava.javacore.ZZEstreams.main;

import tiagobarbosa.marathonjava.javacore.ZZEstreams.domain.Category;
import tiagobarbosa.marathonjava.javacore.ZZEstreams.domain.LightNovel;
import tiagobarbosa.marathonjava.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMain15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);
        for (Map.Entry<Category, DoubleSummaryStatistics> entry : collect.entrySet()) {
            System.out.println(entry.getKey());
            System.out.print("Count: " + entry.getValue().getCount());
            System.out.println(", Average: " + entry.getValue().getAverage());
        }
        System.out.println("--------------------------------------");

        Map<Category, Set<Promotion>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(getPromotionFunction(), Collectors.toSet())));
        System.out.println(collect1);
        for (Map.Entry<Category, Set<Promotion>> entry : collect1.entrySet()) {
            System.out.println(entry.getKey());
            for (Promotion promotion : entry.getValue()) {
                System.out.println("  - " + promotion);
            }
        }
        System.out.println("--------------------------------------");

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(getPromotionFunction(), Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }

    private static Function<LightNovel, Promotion> getPromotionFunction() {
        return ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
