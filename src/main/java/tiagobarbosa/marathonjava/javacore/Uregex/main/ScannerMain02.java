package tiagobarbosa.marathonjava.javacore.Uregex.main;

import java.util.Scanner;

public class ScannerMain02 {
    public static void main(String[] args) {
        String text = "Mary,John,Peter,true,400";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int -> " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean -> " + b);
            } else {
                System.out.println(scanner.next());
            }
        }
    }
}
