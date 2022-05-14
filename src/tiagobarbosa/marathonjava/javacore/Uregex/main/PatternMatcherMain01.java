package tiagobarbosa.marathonjava.javacore.Uregex.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherMain01 {
    public static void main(String[] args) {
        String regex = "aba";
        String text01 = "abaaba";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text01);
        System.out.println("text:  " + text01);
        System.out.println("index: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Find positions");
        while (matcher.find()) {
            System.out.print(matcher.start() + " "+matcher.group()+"\n");
        }

        System.out.println("\n============================");
        String text02 = "abababa";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(text02);
        System.out.println("text:  " + text02);
        System.out.println("index: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Find positions");
        while (matcher.find()) {
            System.out.print(matcher.start() + " "+matcher.group()+"\n");
        }


    }
}
