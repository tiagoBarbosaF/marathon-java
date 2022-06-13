package tiagobarbosa.marathonjava.javacore.Ycollections.main;

import tiagobarbosa.marathonjava.javacore.Ycollections.domain.Fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class FruitByIdComparator implements Comparator<Fruit>{

    @Override
    public int compare(Fruit fruit1, Fruit fruit2) {
        return fruit1.getId().compareTo(fruit2.getId());
    }
}

public class FruitSortMain01 {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit(5L, "Pear", 10.30));
        fruits.add(new Fruit(3L, "Banana", 3.40));
        fruits.add(new Fruit(4L, "Orange", 7.90));
        fruits.add(new Fruit(1L, "Apple", 12.40));
        fruits.add(new Fruit(2L, "Cajá", 30.50));

        System.out.println("Unsorted -> " + fruits);
        for (Fruit fruit : fruits) {
            System.out.println("ID: " + fruit.getId() + ", Name: " + fruit.getName() + ", Price: " + fruit.getPrice());
        }

        Collections.sort(fruits);
        System.out.println("Sorted by Comparable -> " + fruits);
        for (Fruit fruit : fruits) {
            System.out.println("ID: " + fruit.getId() + ", Name: " + fruit.getName() + ", Price: " + fruit.getPrice());
        }

        Collections.sort(fruits);
        System.out.println("Sorted by Comparator -> " + fruits);
        fruits.sort(new FruitByIdComparator());
        for (Fruit fruit : fruits) {
            System.out.println("ID: " + fruit.getId() + ", Name: " + fruit.getName() + ", Price: " + fruit.getPrice());
        }
    }
}
