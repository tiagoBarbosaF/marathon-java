package tiagobarbosa.marathonjava.introduction;

public class Class06RepetitionStructuresExercise03 {
    public static void main(String[] args) {
        System.out.println("== Car financialment ==\n");

        double carValue = 25500D;

        System.out.println("Car value => " + carValue);
        for (int i = 1; i < carValue; i++) {
            double installmentValue = carValue / i;
            if (installmentValue < 1000){
                break;
            }
                System.out.println("Installment (" + i + ") = " + installmentValue);
        }
    }
}
