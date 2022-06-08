package tiagobarbosa.marathonjava.javacore.ZZEstreams.main;

import tiagobarbosa.marathonjava.javacore.ZZEstreams.domain.Category;
import tiagobarbosa.marathonjava.javacore.ZZEstreams.domain.LightNovel;
import tiagobarbosa.marathonjava.javacore.ZZEstreams.domain.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain13 {
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
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));
        System.out.println(collect);
        System.out.println("------------------------------------------------");

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));
        System.out.println(collect1);
    }
}
