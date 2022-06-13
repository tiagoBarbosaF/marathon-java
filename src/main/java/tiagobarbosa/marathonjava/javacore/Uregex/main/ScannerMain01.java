package tiagobarbosa.marathonjava.javacore.Uregex.main;

public class ScannerMain01 {
    public static void main(String[] args) {
        String text = "Mary, John, Peter, true, 400";
        String[] split = text.split(",");
        for (String names : split) {
            System.out.println(names.trim());
        }

    }
}
