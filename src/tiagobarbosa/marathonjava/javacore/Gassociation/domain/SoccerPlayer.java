package tiagobarbosa.marathonjava.javacore.Gassociation.domain;

public class SoccerPlayer {
    private String name;
    private Team team;

    public SoccerPlayer(String name) {
        this.name = name;
    }

    public void print() {
        if (team != null) {
            System.out.println("Soccer player -> Name: " + this.name + ", Soccer Team: " + this.team.getName());
        } else {
            System.out.println("Soccer player -> Name: " + this.name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
