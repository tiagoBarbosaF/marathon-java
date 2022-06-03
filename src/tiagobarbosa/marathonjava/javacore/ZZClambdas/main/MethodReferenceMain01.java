package tiagobarbosa.marathonjava.javacore.ZZClambdas.main;

import tiagobarbosa.marathonjava.javacore.ZZClambdas.domain.Anime;
import tiagobarbosa.marathonjava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to a static method
public class MethodReferenceMain01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One Piece", 900), new Anime("Hellsing", 12), new Anime("Berserk", 24)));
//        Collections.sort(animeList, (a1, a2)-> a1.getTitle().compareTo(a2.getTitle()));
        animeList.sort(AnimeComparators::compareByTitle);
        System.out.println(animeList);
        System.out.println("----------------------------------");
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
