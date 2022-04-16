package tiagobarbosa.marathonjava.introduction;

public class Class04Operators {
    public static void main(String[] args) {
        System.out.println("Operators => + - * /");
        int number01 = 10;
        double number02 = 20;
        double resultSum = number01 + number02;
        double resultSub = number01 - number02;
        double resultMul = number01 * number02;
        double resultDiv = number01 / number02;

        System.out.println("Sum - " + resultSum);
        System.out.println("Subtraction - " + resultSub);
        System.out.println("Multiplication - " + resultMul);
        System.out.println("Divisor - " + resultDiv);

        System.out.println("\n================================\n");

        System.out.println("Operators => %");
        double rest = 21 % 7;
        System.out.println(rest);

        System.out.println("\n================================\n");

        System.out.println("Operators => < > <= >= == !=");
        System.out.println("Number 01 -> "+number01);
        System.out.println("Number 02 -> "+number02);

        boolean isTenBiggerThanTwenty = number01 > number02;
        boolean isTenMinorThanTwenty = number01 < number02;
        boolean isTenEqualThanTwenty = number01 == number02;
        boolean isTenEqualThanTen = number01 == number01;
        boolean isTenDifferentThanTen = number01 != number01;

        System.out.println("\nisTenBiggerThanTwenty " + isTenBiggerThanTwenty);
        System.out.println("isTenMinorThanTwenty " + isTenMinorThanTwenty);
        System.out.println("isTenEqualThanTwenty " + isTenEqualThanTwenty);
        System.out.println("isTenEqualThanTen " + isTenEqualThanTen);
        System.out.println("isTenDifferentThanTen " + isTenDifferentThanTen);
    }
}
