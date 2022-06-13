package tiagobarbosa.marathonjava.javacore.Einitializationblocks.main;

import tiagobarbosa.marathonjava.javacore.Einitializationblocks.domain.Anime;

public class AnimeMain01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }

    }
}
