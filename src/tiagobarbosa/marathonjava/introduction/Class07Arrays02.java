package tiagobarbosa.marathonjava.introduction;

public class Class07Arrays02 {
    public static void main(String[] args) {
        /*
         * Default values for arrays
         *  - byte, short, int, long, float, double --> 0
         *  - char --> '\u0000' -> ' '
         *  - boolean --> false
         *  - String --> null
         */

        String[] names = new String[3];
        String[] names02 = {"Tiago", "John", "Peter"};
        names[0] = "Tiago";
        names[1] = "John";
        names[2] = "Peter";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // format for enhanced
        for (String name : names02) {
            System.out.println(name);
        }

        System.out.println("Array names --> " + names[0] + ", " + names[1] + ", " + names[2]);
    }
}
