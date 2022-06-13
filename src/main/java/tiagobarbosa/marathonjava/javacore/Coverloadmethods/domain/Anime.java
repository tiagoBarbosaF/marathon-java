package tiagobarbosa.marathonjava.javacore.Coverloadmethods.domain;

public class Anime {
    private String name;
    private int episodes;
    private String type;
    private String genre;

    public void init(String name, int episodes, String type) {
        this.name = name;
        this.episodes = episodes;
        this.type = type;
    }

    public void init(String name, int episodes, String type, String genre) {
        this.init(name, episodes, type);
        this.genre = genre;
    }

    public void print() {
        System.out.println("Anime -> Name: " + this.name + ", Type: " + this.type + ", Episodes: " + this.episodes + ", Genre: " + this.genre);
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
