package tiagobarbosa.marathonjava.javacore.Dconstructors.main;


import tiagobarbosa.marathonjava.javacore.Dconstructors.domain.Anime;

public class AnimeMain01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece", 1000, "Action", "Shounen", "Madhouse");

        anime.print();
    }
}
