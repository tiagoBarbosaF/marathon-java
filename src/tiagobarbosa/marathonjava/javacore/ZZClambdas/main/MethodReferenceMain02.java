package tiagobarbosa.marathonjava.javacore.ZZClambdas.main;

import tiagobarbosa.marathonjava.javacore.ZZClambdas.domain.Anime;
import tiagobarbosa.marathonjava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of a particular object
public class MethodReferenceMain02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One Piece", 900), new Anime("Hellsing", 12), new Anime("Berserk", 24)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
