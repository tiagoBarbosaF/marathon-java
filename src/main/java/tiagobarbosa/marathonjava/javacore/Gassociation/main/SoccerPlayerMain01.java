package tiagobarbosa.marathonjava.javacore.Gassociation.main;

import tiagobarbosa.marathonjava.javacore.Gassociation.domain.SoccerPlayer;

public class SoccerPlayerMain01 {
    public static void main(String[] args) {
        SoccerPlayer soccerPlayer01 = new SoccerPlayer("Zidane");
        SoccerPlayer soccerPlayer02 = new SoccerPlayer("Maradona");
        SoccerPlayer soccerPlayer03 = new SoccerPlayer("Zico");

        SoccerPlayer[] soccerPlayers = {soccerPlayer01, soccerPlayer02, soccerPlayer03};

        for (SoccerPlayer soccerPlayer : soccerPlayers) {
            soccerPlayer.print();
        }

    }
}
