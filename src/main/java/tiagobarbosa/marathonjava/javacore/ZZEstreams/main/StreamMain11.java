package tiagobarbosa.marathonjava.javacore.ZZEstreams.main;

import tiagobarbosa.marathonjava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain11 {
    private static List<LightNovel> lightNovels = new ArrayList(List.of(
            new LightNovel("The Begginer after the end", 8.99),
            new LightNovel("A Certain Magical Index", 2.99),
            new LightNovel("Maburaho", 6.99),
            new LightNovel("Blood+", 9.99),
            new LightNovel("Listen to Me, Girls. I Am Your Father!", 3.99),
            new LightNovel("Durarara!!", 1.99),
            new LightNovel("Durarara!!", 1.99),
            new LightNovel("Record of Lodoss War", 7.99),
            new LightNovel("Haiyore! Nyaruko-san", 4.00),
            new LightNovel("Sword Art Online", 12.99)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);
        double max = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice)).getMax();
        System.out.println(max);

        String titles = lightNovels.stream().map(LightNovel::getTitle).sorted().collect(Collectors.joining(", "));
        System.out.println(titles);
    }
}
