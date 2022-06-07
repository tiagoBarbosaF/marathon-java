package tiagobarbosa.marathonjava.javacore.ZZEstreams.main;

import tiagobarbosa.marathonjava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamMain06 {
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
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0));

        lightNovels.stream().filter(ln -> ln.getPrice() > 3).findAny().ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .min(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
