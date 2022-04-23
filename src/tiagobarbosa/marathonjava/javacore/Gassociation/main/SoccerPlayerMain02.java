package tiagobarbosa.marathonjava.javacore.Gassociation.main;

import tiagobarbosa.marathonjava.javacore.Gassociation.domain.SoccerPlayer;
import tiagobarbosa.marathonjava.javacore.Gassociation.domain.Team;

public class SoccerPlayerMain02 {
    public static void main(String[] args) {
        SoccerPlayer soccerPlayer = new SoccerPlayer("Maradona");
        Team team = new Team("Argentine");
        soccerPlayer.print();

        soccerPlayer.setTeam(team);
        soccerPlayer.print();
    }
}
