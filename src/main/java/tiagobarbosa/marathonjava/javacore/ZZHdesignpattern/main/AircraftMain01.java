package tiagobarbosa.marathonjava.javacore.ZZHdesignpattern.main;

import tiagobarbosa.marathonjava.javacore.ZZHdesignpattern.domain.Aircraft;

public class AircraftMain01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        Aircraft aircraft = new Aircraft("123-345");
        System.out.println(aircraft.bookSeat(seat));
    }
}
