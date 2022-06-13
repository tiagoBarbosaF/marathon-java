package tiagobarbosa.marathonjava.javacore.Ycollections.main;

import tiagobarbosa.marathonjava.javacore.Ycollections.domain.Fruit;

import java.util.ArrayList;
import java.util.List;

public class IteratorMain01 {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit(5L, "Pear", 10.30, 0));
        fruits.add(new Fruit(3L, "Banana", 3.40, 6));
        fruits.add(new Fruit(4L, "Orange", 7.90, 0));
        fruits.add(new Fruit(1L, "Apple", 12.40, 3));
        fruits.add(new Fruit(2L, "Cajá", 30.50, 0));

//        Iterator<Fruit> fruitIterator = fruits.iterator();
//        while (fruitIterator.hasNext()){
//            if (fruitIterator.next().getQuantity() == 0){
//                fruitIterator.remove();
//            }
//        }
//        System.out.println(fruits);

        fruits.removeIf(fruit -> fruit.getQuantity() == 0);
        System.out.println(fruits);
    }
}
