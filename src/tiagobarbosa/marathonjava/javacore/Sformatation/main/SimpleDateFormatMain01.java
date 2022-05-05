package tiagobarbosa.marathonjava.javacore.Sformatation.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatMain01 {
    public static void main(String[] args) {
        String pattern = "'Fortaleza,' dd 'of' MMMM 'of' yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));

        try {
            System.out.println(simpleDateFormat.parse("Fortaleza, 05 of May of 2022"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
