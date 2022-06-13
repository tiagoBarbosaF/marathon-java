package tiagobarbosa.marathonjava.javacore.Ycollections.main;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapMain01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letter A");
        map.put("D", "Letter D");
        map.put("B", "Letter B");
        map.put("E", "Letter E");
        map.put("C", "Letter C");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("headMap (D) -> "+map.headMap("D", true));
        System.out.println("ceilingKey (D) -> "+map.ceilingKey("D"));
        System.out.println("lowerKey (D) -> "+map.lowerKey("D"));
        System.out.println("floorKey (D) -> "+map.floorKey("D"));
        System.out.println("higherKey (D) -> "+map.higherKey("D"));
    }
}
