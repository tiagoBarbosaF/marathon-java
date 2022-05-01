package tiagobarbosa.marathonjava.javacore.Qstring.main;

public class StringMain01 {
    public static void main(String[] args) {
        String name = "Tiago"; // String constant pool
        String name2 = "Tiago";
        name = name.concat(" Barbosa");
        System.out.println(name);
        System.out.println(name = name2);
        String name3 = new String("Tiago");
        System.out.println(name2 == name3);
        System.out.println(name2 == name3.intern());
    }
}
