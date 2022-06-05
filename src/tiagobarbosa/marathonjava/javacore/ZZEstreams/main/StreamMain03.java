package tiagobarbosa.marathonjava.javacore.ZZEstreams.main;

import tiagobarbosa.marathonjava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain03 {
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
        lightNovels.forEach(System.out::println);

        Stream<LightNovel> stream = lightNovels.stream();
        long count = stream.distinct().filter(ln -> ln.getPrice() <= 4).count();
        System.out.println(count);
    }
}
