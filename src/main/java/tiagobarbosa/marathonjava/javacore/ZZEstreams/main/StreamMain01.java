package tiagobarbosa.marathonjava.javacore.ZZEstreams.main;

import tiagobarbosa.marathonjava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamMain01 {
    private static final List<LightNovel> lightNovels = new ArrayList(List.of(
            new LightNovel("The Begginer after the end", 8.99),
            new LightNovel("A Certain Magical Index", 2.99),
            new LightNovel("Maburaho", 6.99),
            new LightNovel("Blood+", 9.99),
            new LightNovel("Listen to Me, Girls. I Am Your Father!", 3.99),
            new LightNovel("Durarara!!", 1.99),
            new LightNovel("Record of Lodoss War", 7.99),
            new LightNovel("Haiyore! Nyaruko-san", 4.00),
            new LightNovel("Sword Art Online", 12.99)
    ));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            System.out.println("Title: " + lightNovel.getTitle() + ", Price: " + lightNovel.getPrice());
        }
        System.out.println("------------------------------------------------------");
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() < 4) {
                System.out.println("Title: " + lightNovel.getTitle() + ", Price: " + lightNovel.getPrice());
            }
        }
        System.out.println("------------------------------------------------------");
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >= 3) {
                break;
            }
        }
        for (String title : titles) {
            System.out.println("Title: " + title);
        }

    }
}
