package tiagobarbosa.marathonjava.javacore.Fstaticmodifiers.domain;

public class Anime {
    private String name;
    private static int[] episodes;

    static {
        System.out.println("Initialize static block 01");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("Initialize static block 02");
    }

    {
        System.out.println("Initialize non-static block");
    }

    public Anime() {
        for (int episode :
                episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
