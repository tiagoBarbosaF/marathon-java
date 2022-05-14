package tiagobarbosa.marathonjava.javacore.Uregex.main;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherMain05 {
    public static void main(String[] args) {
        // [] group
        // ? zero or one
        // * zero or more
        // + one or more
        // {n,m} of n until m
        // () delimiter
        // | or
        // $ end of line
        String regex = "([a-zA-Z\\d._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "jhon@hotmail.com, 123bob@outlook.com, !@#maria@mail.br, test@gmail.com.br, peter@mail";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text:  " + text);
        System.out.println("index: 0123456789");
        System.out.println("regex: " + regex + " - email");
        System.out.println("Find positions");
        while (matcher.find()) {
            System.out.print(matcher.start() + " "+matcher.group()+"\n");
        }

        System.out.println(Arrays.toString(text.split(",")));
    }
}
