package tiagobarbosa.marathonjava.javacore.Sformatation.main;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatMain01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getInstance();
        numberFormats[1] = NumberFormat.getInstance(localeJP);
        numberFormats[2] = NumberFormat.getInstance(localeBR);
        numberFormats[3] = NumberFormat.getInstance(localeIT);

        double value = 10_000_000.2134;

        for (NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.format(value));
        }

    }
}
