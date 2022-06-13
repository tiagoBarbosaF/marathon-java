package tiagobarbosa.marathonjava.introduction;

public class Class05ConditionalStructures02 {
    public static void main(String[] args) {
        /* Rules
         *   age < 15 -> children's category
         *   age >= 15 && age < 18 -> juvenile category
         *   age >= 18 -> adult category
         * */

        int age = 19;
        String category;

        if (age >= 18) {
            category = "Adult category";
        } else if (age >= 15 && age < 18) {
            category = "Juvenile category";
        } else {
            category = "Children's category";
        }
        System.out.println(category);


        // Ternary operator
        System.out.println("\nTernary Operator");

        category = age >= 18 ? "Adult category" : age >= 15 && age < 18 ? "Juvenile category" : "Children's category";

        System.out.println(category);
    }
}
