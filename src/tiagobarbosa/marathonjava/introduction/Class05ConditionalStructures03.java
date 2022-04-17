package tiagobarbosa.marathonjava.introduction;

public class Class05ConditionalStructures03 {
    public static void main(String[] args) {
        System.out.println("== Day of week ==");

        byte day = 5;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("It's not a value number.");
                break;
        }
    }
}
