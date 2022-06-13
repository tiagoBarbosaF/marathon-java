package tiagobarbosa.marathonjava.javacore.Ycollections.main;

import tiagobarbosa.marathonjava.javacore.Ycollections.domain.Fruit;
import tiagobarbosa.marathonjava.javacore.Ycollections.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneBrandSort implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}

class FruitPriceComparator implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

public class NavigableSortMain01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> smartphones = new TreeSet<>(new SmartphoneBrandSort());
        Smartphone smartphone = new Smartphone("1234", "Nokia");
        smartphones.add(smartphone);

        NavigableSet<Fruit> fruits = new TreeSet<>(new FruitPriceComparator());
        fruits.add(new Fruit(5L, "Pear", 10.30));
        fruits.add(new Fruit(3L, "Banana", 3.40));
        fruits.add(new Fruit(4L, "Orange", 7.90));
        fruits.add(new Fruit(1L, "Apple", 12.40));
        fruits.add(new Fruit(2L, "Cajá", 30.50));
        fruits.add(new Fruit(2L, "Cajá", 10.10));

        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }

        Fruit grape = new Fruit(1L, "Grape", 8);

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("--------------------------");
        System.out.println("Lower -> " + fruits.lower(grape));
        System.out.println("Floor -> " + fruits.floor(grape));
        System.out.println("Higher -> " + fruits.higher(grape));
        System.out.println("Ceiling -> " + fruits.ceiling(grape));

        System.out.println("-----------------------------");
        System.out.println(fruits.size());
        System.out.println(fruits.pollLast());
        System.out.println(fruits.size());
    }
}
