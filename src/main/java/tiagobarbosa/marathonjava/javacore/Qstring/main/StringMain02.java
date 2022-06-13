package tiagobarbosa.marathonjava.javacore.Qstring.main;

public class StringMain02 {
    public static void main(String[] args) {
        String name = "Luffy";
        String name2 = "       Luffy      ";
        String numbers = "012345";
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.replace("f", "l"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(numbers.length());
        System.out.println(numbers.substring(3, numbers.length()));
        System.out.println(name2.trim());
    }
}
