package tiagobarbosa.marathonjava.javacore.Gassociation.main;

import java.util.Scanner;

public class KeyboardReadingMain01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Your name -> ");
        String name = input.nextLine();

        System.out.print("Your age -> ");
        int age = input.nextInt();

        System.out.print("Insert M or F for your gender -> ");
        char gender = input.next().charAt(0);

        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }
}
