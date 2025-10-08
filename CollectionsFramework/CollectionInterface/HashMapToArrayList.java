package CollectionsFramework.CollectionInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {
    public static void main(String[] args) {
        Map<String, Integer> data = new HashMap<>();

        data.put("abc", 1);
        data.put("def", 2);
        data.put("ghi", 3);

        List<Map.Entry<String, Integer>> list = data.entrySet()
                .stream()
                .toList();

        System.out.println(list);
    }
}
