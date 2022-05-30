package tiagobarbosa.marathonjava.javacore.Ycollections.main;

import tiagobarbosa.marathonjava.javacore.Ycollections.domain.Consumer;
import tiagobarbosa.marathonjava.javacore.Ycollections.domain.Fruit;

import java.util.HashMap;
import java.util.Map;

public class MapMain02 {
    public static void main(String[] args) {
        Consumer consumer01 = new Consumer("Tiago Barbosa");
        Consumer consumer02 = new Consumer("Digibee");

        Fruit pear = new Fruit(5L, "Pear", 10.30);
        Fruit banana = new Fruit(3L, "Banana", 3.40);
        Fruit orange = new Fruit(4L, "Orange", 7.90);
        Fruit apple = new Fruit(1L, "Apple", 12.40);
        Fruit caja = new Fruit(2L, "Cajá", 30.50);

        Map<Consumer, Fruit> consumerFruit = new HashMap<>();
        consumerFruit.put(consumer01, orange);
        consumerFruit.put(consumer02, apple);
        consumerFruit.putIfAbsent(consumer01, caja);

        for (Map.Entry<Consumer, Fruit> entry : consumerFruit.entrySet()) {
            System.out.println(entry.getKey().getName() + " -> " + entry.getValue().getName());
        }

    };
}
