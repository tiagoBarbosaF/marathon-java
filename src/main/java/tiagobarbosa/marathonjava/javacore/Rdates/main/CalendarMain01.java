package tiagobarbosa.marathonjava.javacore.Rdates.main;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Sunday is the first day of the week in this country");
        }

        System.out.println("Day of week: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(Calendar.DAY_OF_WEEK);
        switch (Calendar.DAY_OF_WEEK){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
        System.out.println("Day of month: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of year: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("Day of week in month: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));


        calendar.add(Calendar.DAY_OF_MONTH, 2);
        calendar.roll(Calendar.HOUR, 12);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
