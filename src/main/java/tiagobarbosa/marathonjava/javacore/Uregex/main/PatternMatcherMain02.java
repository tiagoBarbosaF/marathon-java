package tiagobarbosa.marathonjava.javacore.Uregex.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherMain02 {
    public static void main(String[] args) {
        // \d = All digits
        String regex = "\\d";
        String text01 = "@#eo_9q3adv4 3oh9";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text01);
        System.out.println("text:  " + text01);
        System.out.println("index: 0123456789");
        System.out.println("regex: " + regex + " - All digits");
        System.out.println("Find positions");
        while (matcher.find()) {
            System.out.print(matcher.start() + " "+matcher.group()+"\n");
        }

        System.out.println("=========================");
        // \D = Everything it isn't digits
        regex = "\\D";
        text01 = "@#eo_9q3adv4 3oh9";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(text01);
        System.out.println("text:  " + text01);
        System.out.println("index: 0123456789");
        System.out.println("regex: " + regex + " - Everything it isn't digits");
        System.out.println("Find positions");
        while (matcher.find()) {
            System.out.print(matcher.start() + " "+matcher.group()+"\n");
        }

        System.out.println("=========================");
        // \D = White spaces
        regex = "\\s";
        text01 = "@#eo_9q3adv4 3oh9";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(text01);
        System.out.println("text:  " + text01);
        System.out.println("index: 0123456789");
        System.out.println("regex: " + regex + " - White spaces");
        System.out.println("Find positions");
        while (matcher.find()) {
            System.out.print(matcher.start() + " "+matcher.group()+"\n");
        }

        System.out.println("=========================");
        // \D = All characters what don't be white spaces
        regex = "\\S";
        text01 = "@#eo_9q3adv4 3oh9";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(text01);
        System.out.println("text:  " + text01);
        System.out.println("index: 0123456789");
        System.out.println("regex: " + regex + " - All characters what don't be white spaces");
        System.out.println("Find positions");
        while (matcher.find()) {
            System.out.print(matcher.start() + " "+matcher.group()+"\n");
        }

        System.out.println("=========================");
        // \w = a-zA-Z, digits, _
        regex = "\\w";
        text01 = "@#eo_9q3adv4 3oh9";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(text01);
        System.out.println("text:  " + text01);
        System.out.println("index: 0123456789");
        System.out.println("regex: " + regex + " - a-zA-Z, digits, _");
        System.out.println("Find positions");
        while (matcher.find()) {
            System.out.print(matcher.start() + " "+matcher.group()+"\n");
        }

        System.out.println("=========================");
        // \W = All if don't included in \w
        regex = "\\W";
        text01 = "@#eo_9q3adv4 3oh9";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(text01);
        System.out.println("text:  " + text01);
        System.out.println("index: 0123456789");
        System.out.println("regex: " + regex + " - All if don't included in \\w");
        System.out.println("Find positions");
        while (matcher.find()) {
            System.out.print(matcher.start() + " "+matcher.group()+"\n");
        }

    }
}
