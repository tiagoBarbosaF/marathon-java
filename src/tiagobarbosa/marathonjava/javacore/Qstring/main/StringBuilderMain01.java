package tiagobarbosa.marathonjava.javacore.Qstring.main;

public class StringBuilderMain01 {
    public static void main(String[] args) {
        String name = "Tiago Barbosa";
        name.concat(" Farias");
        name.substring(0,3);
        System.out.println(name);

        StringBuilder stringBuilder = new StringBuilder("Tiago Barbosa");
        stringBuilder.append(" Farias").append(", Developer");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.delete(0,3);
        System.out.println(stringBuilder);
    }
}
