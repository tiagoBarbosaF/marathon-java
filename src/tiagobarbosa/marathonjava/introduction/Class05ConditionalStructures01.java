package tiagobarbosa.marathonjava.introduction;

public class Class05ConditionalStructures01 {
    public static void main(String[] args) {
        int age = 20;
        boolean isAuthorizedToBuyDrink = age >= 18;

        if (isAuthorizedToBuyDrink){
            System.out.println("Authorized to buy alcoholic drink.");
        }

        if (!isAuthorizedToBuyDrink){
            System.out.println("Not authorized to buy alcoholic drink.");
        }
    }
}
