package tiagobarbosa.marathonjava.introduction;

public class Class05ConditionalStructuresExercise02 {
    public static void main(String[] args) {
        int day = 7;

        switch (day){
            case 1:
            case 7:
                System.out.println("Weekend.");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Business day.");
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }
    }
}
