package tiagobarbosa.marathonjava.javacore.Ycollections.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortMain01 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Pear");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        System.out.println("Unsorted -> " + fruits);
        Collections.sort(fruits);
        System.out.println("Sorted -> " + fruits);

        List<Double> values = new ArrayList<>();
        values.add(150.30);
        values.add(40.32);
        values.add(90.99);
        values.add(1.30);

        System.out.println("Unsorted -> " + values);
        Collections.sort(values);
        System.out.println("Sorted -> " + values);

//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }

    }
}
