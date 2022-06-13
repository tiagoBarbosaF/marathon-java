package tiagobarbosa.marathonjava.javacore.ZZHdesignpattern.main;

import tiagobarbosa.marathonjava.javacore.ZZHdesignpattern.domain.AircraftSingletonEager;

public class AircraftSingletonEagerMain01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEager.getINSTANCE());
        AircraftSingletonEager aircraft = AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
}
