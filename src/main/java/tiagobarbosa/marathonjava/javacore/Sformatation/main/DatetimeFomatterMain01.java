package tiagobarbosa.marathonjava.javacore.Sformatation.main;

import tiagobarbosa.marathonjava.javacore.Gassociation.domain.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DatetimeFomatterMain01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20220510", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2022-05-10+18:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2022-05-10", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        // dd/MM/yyyy
        DateTimeFormatter formatterPtBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatPtBR = LocalDate.now().format(formatterPtBr);
        System.out.println(formatPtBR);

        // MM/dd/yyyy
        DateTimeFormatter formatterUsa = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formatUsa = LocalDate.now().format(formatterUsa);
        System.out.println(formatUsa);

        // yyy/MM/dd
        DateTimeFormatter formatterJp = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formatJp = LocalDate.now().format(formatterJp);
        System.out.println(formatJp);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("10.Mai.2022", formatterGR);
        System.out.println(parseGR);
    }
}
