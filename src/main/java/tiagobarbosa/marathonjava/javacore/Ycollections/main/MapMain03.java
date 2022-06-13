package tiagobarbosa.marathonjava.javacore.Ycollections.main;

import tiagobarbosa.marathonjava.javacore.Ycollections.domain.Consumer;
import tiagobarbosa.marathonjava.javacore.Ycollections.domain.Fruit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain03 {
    public static void main(String[] args) {
        Consumer consumer01 = new Consumer("Tiago Barbosa");
        Consumer consumer02 = new Consumer("Digibee");

        Fruit pear = new Fruit(5L, "Pear", 10.30);
        Fruit banana = new Fruit(3L, "Banana", 3.40);
        Fruit orange = new Fruit(4L, "Orange", 7.90);
        Fruit apple = new Fruit(1L, "Apple", 12.40);
        Fruit caja = new Fruit(2L, "Cajá", 30.50);

        Map<Consumer, List<Fruit>> consumerFruit = new HashMap<>();

        List<Fruit> fruitConsumer01List = List.of(pear, orange, caja);
        List<Fruit> fruitConsumer02List = List.of(apple, banana);
        consumerFruit.put(consumer01, fruitConsumer01List);
        consumerFruit.put(consumer02, fruitConsumer02List);

        for (Map.Entry<Consumer, List<Fruit>> entry : consumerFruit.entrySet()) {
            System.out.println("Consumer -> " + entry.getKey().getName());
            System.out.println(" - List of fruits:");
            for (Fruit fruit : entry.getValue()) {
                System.out.println("  - " + fruit.getName());
            }

        }

    }

    ;
}
