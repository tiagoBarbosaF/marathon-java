package tiagobarbosa.marathonjava.javacore.Coverloadmethods.main;

import tiagobarbosa.marathonjava.javacore.Coverloadmethods.domain.Anime;

public class AnimeMain01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("One Piece", 1000, "Shounen");
        anime.init("One Piece", 1000, "Action","Shounen");
        anime.print();
    }
}
