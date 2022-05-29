package tiagobarbosa.marathonjava.javacore.Ycollections.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchMain01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(0);
        numbers.add(1);
        numbers.add(5);
        numbers.add(4);

        System.out.println("Unsorted -> " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted -> " + numbers);
        System.out.println("Binary Search -> " + Collections.binarySearch(numbers, 6));
    }
}
