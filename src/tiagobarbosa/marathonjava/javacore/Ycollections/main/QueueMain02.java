package tiagobarbosa.marathonjava.javacore.Ycollections.main;

import tiagobarbosa.marathonjava.javacore.Ycollections.domain.Consumer;
import tiagobarbosa.marathonjava.javacore.Ycollections.domain.Fruit;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain02 {
    public static void main(String[] args) {
        Queue<Fruit> fruits = new PriorityQueue<>(new FruitPriceComparator().reversed());
        fruits.add(new Fruit(5L, "Pear", 10.30, 0));
        fruits.add(new Fruit(3L, "Banana", 3.40, 6));
        fruits.add(new Fruit(4L, "Orange", 7.90, 0));
        fruits.add(new Fruit(1L, "Apple", 12.40, 3));
        fruits.add(new Fruit(2L, "Cajá", 30.50, 0));

        while (!fruits.isEmpty()){
            System.out.println(fruits.poll());
        }
    }
}
