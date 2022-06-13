package tiagobarbosa.marathonjava.javacore.Uregex.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherMain03 {
    public static void main(String[] args) {
        // \d = All digits
        String regex = "0[xX][0-9a-fA-F]";
        String text01 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text01);
        System.out.println("text:  " + text01);
        System.out.println("index: 0123456789");
        System.out.println("regex: " + regex + " - All digits");
        System.out.println("Find positions");
        while (matcher.find()) {
            System.out.print(matcher.start() + " "+matcher.group()+"\n");
        }
    }
}
