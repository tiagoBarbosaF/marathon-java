package tiagobarbosa.marathonjava.javacore.ZZClambdas.main;

import tiagobarbosa.marathonjava.javacore.ZZClambdas.domain.Anime;
import tiagobarbosa.marathonjava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// Reference to a constructor
public class MethodReferenceMain04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One Piece", 900), new Anime("Hellsing", 12), new Anime("Berserk", 24)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
        System.out.println("----------------------------------------------");

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println("BiFunction<String, Integer, Anime> -> "+ animeBiFunction.apply("Haikyuu", 45));
        System.out.println("BiFunction<String, Integer, Anime> -> "+ animeBiFunction2.apply("Toradora", 24));
    }
}
