package tiagobarbosa.marathonjava.javacore.Dconstructors.domain;

public class Anime {
    private String name;
    private int episodes;
    private String type;
    private String genre;
    private String studio;

    public Anime() {
        System.out.println("== Anime List ==");
    }

    public Anime(String name, int episodes, String type, String genre) {
        this();
        this.name = name;
        this.episodes = episodes;
        this.type = type;
        this.genre = genre;
    }

    public Anime(String name, int episodes, String type, String genre, String studio) {
        this(name, episodes, type, genre);
        this.studio = studio;
    }

    public void print() {
        System.out.println("Anime -> Name: " + this.name + ", Type: " + this.type + ", Episodes: " + this.episodes + ", Genre: " + this.genre + ", Studio: " + this.studio);
    }

    public String getName() {
        return name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getType() {
        return type;
    }

    public String getGenre() {
        return genre;
    }
}
