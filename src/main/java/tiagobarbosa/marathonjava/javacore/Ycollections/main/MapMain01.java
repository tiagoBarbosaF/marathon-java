package tiagobarbosa.marathonjava.javacore.Ycollections.main;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapMain01 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("keiboard", "keyboard");
        map.put("mouze", "mouse");
        map.put("caki", "cake");
        map.put("caki2", "cake");

        System.out.println("Mar keySet:");
        System.out.println(map);
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        System.out.println("----------------------\nMap Values:");
        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("----------------------\nMap entrySet:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
