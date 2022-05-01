package tiagobarbosa.marathonjava.javacore.Rdates.main;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleMain01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeNetherlands = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat01 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateFormat02 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat dateFormat03 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat dateFormat04 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat dateFormat05 = DateFormat.getDateInstance(DateFormat.FULL, localeNetherlands);

        System.out.println(localeItaly.getDisplayCountry(localeItaly) + " - " + dateFormat01.format(calendar.getTime()));
        System.out.println(localeCH.getDisplayCountry(localeCH) + " - " + dateFormat02.format(calendar.getTime()));
        System.out.println(localeIndia.getDisplayCountry(localeIndia) + " - " + dateFormat03.format(calendar.getTime()));
        System.out.println(localeJapan.getDisplayCountry(localeJapan) + " - " + dateFormat04.format(calendar.getTime()));
        System.out.println(localeNetherlands.getDisplayCountry(localeNetherlands) + " - " + dateFormat05.format(calendar.getTime()));
    }
}
