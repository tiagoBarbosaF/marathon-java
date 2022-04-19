package tiagobarbosa.marathonjava.introduction;

public class Class06RepetitionStructures01 {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("== While ==");
        while (count < 10){
            System.out.println("While " + ++count);
        }

        System.out.println("\n== Do-while ==");
        count = 0;

        do {
            System.out.println("Do-while "+ ++count);
        } while (count < 10);

        System.out.println("\n== For ==");
        for (int i = 0; i < 10; i++){
            System.out.println("For " + i);
        }
    }
}
