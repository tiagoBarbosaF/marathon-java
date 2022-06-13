package tiagobarbosa.marathonjava.javacore.Bintroductionmethods.domain;

public class Calculator {

    public void sumTwoNumbers(double num01, double num02){
        System.out.println(num01 + num02);
    }

    public void subtractTwoNumbers(double num01, double num02){
        System.out.println(num01 - num02);
    }

    public void multipleTwoNumbers(double num01, double num02){
        System.out.println(num01 * num02);
    }

    public double divideTwoNumbers(double num01, double num02) {
        if (num02 == 0){
            return 0;
        }
        return num01 / num02;
    }

    public void sumArray(int[] numbers){
        int sum = 0;
        for (int num :
                numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers){
        int sum = 0;
        for (int num :
                numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
