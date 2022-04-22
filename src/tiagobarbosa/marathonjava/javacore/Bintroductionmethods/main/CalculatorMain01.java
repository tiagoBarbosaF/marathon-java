package tiagobarbosa.marathonjava.javacore.Bintroductionmethods.main;

import tiagobarbosa.marathonjava.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorMain01 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("== SUM ==");
        calculator.sumTwoNumbers(10, 25);

        System.out.println("\n== SUBTRACT ==");
        calculator.subtractTwoNumbers(10, 56);

        System.out.println("\n== MULTIPLE ==");
        calculator.multipleTwoNumbers(12.5, 30);

        System.out.println("\n== DIVIDE ==");
        System.out.println(calculator.divideTwoNumbers(50.5, 0));

        int[] numbers = {1,2,3,4,5};

        System.out.println("\n== SUM ARRAYS ==");
        calculator.sumArray(numbers);

        System.out.println("\n== SUM VAR ARGS ==");
        calculator.sumVarArgs(10,20,30,40,50);
    }
}
