package CollectionsFramework;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationException {
    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentHashMap<>();    //Concurrent HashMap handel the Iterators in proper manner without throwing the
        // ConcurrentModificationException
        map.put("one", 1);
        map.put("two", 1);
        map.put("three", 1);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getKey().equals("two")) {
                map.put("four", 4);
            }
        }
        System.out.println(map);
    }
}
