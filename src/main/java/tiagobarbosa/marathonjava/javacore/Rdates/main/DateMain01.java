package tiagobarbosa.marathonjava.javacore.Rdates.main;

import java.util.Date;

public class DateMain01 {
    public static void main(String[] args) {
        Date date = new Date(1651425210826L);
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
