package hello.java.s04_collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1", "1");
        map.put("2", "2");
        map.put("2", "3");
        map.put("3", "3");
        map.put("4", "4");
        map.put(null, "null");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        // map.forEach((k, v) -> System.out.println(k + ":" + v));

        var oldValue = map.put("2", "two");
        System.out.println("oldValue = " + oldValue);
        map.forEach((k, v) -> System.out.println(k + ":" + v));

        var five = map.computeIfAbsent("5", k -> "5");
        System.out.println("five = " + five);
    }
}
