package tiagobarbosa.marathonjava.introduction;

public class Class05ConditionalStructuresExercise {
    public static void main(String[] args) {

        System.out.println("== Netherlands taxes ==");

        double yearlySalary = 120000;
        double rate01 = 9.70 / 100;
        double rate02 = 37.35 / 100;
        double rate03 = 49.50 / 100;
        double result;

        if (yearlySalary < 34713) {
            result = yearlySalary * rate01;
        } else if (yearlySalary >= 34713 && yearlySalary < 68508) {
            result = yearlySalary * rate02;
        } else {
            result = yearlySalary * rate03;
        }

        System.out.println("Your yearly taxes is -> " + result);
    }
}
