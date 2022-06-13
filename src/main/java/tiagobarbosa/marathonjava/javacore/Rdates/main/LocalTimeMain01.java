package tiagobarbosa.marathonjava.javacore.Rdates.main;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeMain01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(20,30,40);
        LocalTime now = LocalTime.now();
        System.out.println(time);
        System.out.println(now);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
