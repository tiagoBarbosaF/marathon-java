package tiagobarbosa.marathonjava.javacore.Uregex.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherMain04 {
    public static void main(String[] args) {
        // [] group
        // ? zero or one
        // * zero or more
        // + one or more
        // {n,m} of n until m
        // () delimiter
        // | or
        // $ end of line
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String text01 = "12 0x 0X 0xFFABC 0x10G 0x1";
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
