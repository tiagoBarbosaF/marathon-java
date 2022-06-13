package tiagobarbosa.marathonjava.javacore.Sformatation.main;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatMain02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getCurrencyInstance();
        numberFormats[1] = NumberFormat.getCurrencyInstance(localeJP);
        numberFormats[2] = NumberFormat.getCurrencyInstance(localeBR);
        numberFormats[3] = NumberFormat.getCurrencyInstance(localeIT);

        double value = 1000.2134;
         
        for (NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(value));
        }

        String valueString = "$1,000.21";
        try {
            System.out.println(numberFormats[0].parse(valueString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
