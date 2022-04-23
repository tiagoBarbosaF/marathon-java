package tiagobarbosa.marathonjava.javacore.Gassociation.domain;

public class Team {
    private String name;
    private SoccerPlayer[] soccerPlayers;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, SoccerPlayer[] soccerPlayers) {
        this.name = name;
        this.soccerPlayers = soccerPlayers;
    }

    public void print() {
        System.out.println("Team -> Name: " + this.name);
        if (soccerPlayers == null) {
            return;
        }
        for (SoccerPlayer soccerPlayer : soccerPlayers) {
            System.out.println(" - Soccer Player -> Name: " + soccerPlayer.getName());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SoccerPlayer[] getSoccerPlayers() {
        return soccerPlayers;
    }

    public void setSoccerPlayers(SoccerPlayer[] soccerPlayers) {
        this.soccerPlayers = soccerPlayers;
    }
}
