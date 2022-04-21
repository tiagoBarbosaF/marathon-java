package tiagobarbosa.marathonjava.introduction;

public class Class06RepetitionStructures02 {
    public static void main(String[] args) {
        System.out.println("== Car financial ==\n");

        double carValue = 25500D;
        for (int installment = (int) carValue; installment >= 1; installment--) {
            double installmentValue = carValue / installment;
            if (installmentValue < 1000){
                continue;
            }
            System.out.println("Installment " + installment + " R$ " + installmentValue);
        }
    }
}
