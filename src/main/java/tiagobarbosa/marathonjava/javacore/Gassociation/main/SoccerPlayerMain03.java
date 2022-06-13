package tiagobarbosa.marathonjava.javacore.Gassociation.main;

import tiagobarbosa.marathonjava.javacore.Gassociation.domain.SoccerPlayer;
import tiagobarbosa.marathonjava.javacore.Gassociation.domain.Team;

public class SoccerPlayerMain03 {
    public static void main(String[] args) {
        Team team01 = new Team("UEFA");
        SoccerPlayer soccerPlayer01 = new SoccerPlayer("Zidane");
        SoccerPlayer soccerPlayer02 = new SoccerPlayer("Zico");
        SoccerPlayer[] soccerPlayers = {soccerPlayer01, soccerPlayer02};

        soccerPlayer01.setTeam(team01);
        soccerPlayer02.setTeam(team01);
        team01.setSoccerPlayers(soccerPlayers);

        team01.print();
    }
}
