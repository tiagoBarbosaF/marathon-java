package tiagobarbosa.marathonjava.javacore.Rdates.main;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain01 {
    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(1986, Month.APRIL,4,10,0,0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(ChronoUnit.DAYS.between(birthday, now));
        System.out.println(ChronoUnit.WEEKS.between(birthday, now));
        System.out.println(ChronoUnit.MONTHS.between(birthday, now));
        System.out.println(ChronoUnit.YEARS.between(birthday, now));
    }
}
