package String;

import java.util.*;

public class SecondMostRepeatedWord {
    private static String findSecondRepeatedWord(String[] strArr) {
        StringBuilder repeated = new StringBuilder();
        Map<String, Integer> strMap = new HashMap<>();
        for (String s : strArr) {
            strMap.put(s, strMap.getOrDefault(s, 0) + 1);
        }
        int max = Collections.max(strMap.values());
        List<Integer> li = new ArrayList<>();
        for (Map.Entry<String, Integer> mapStr : strMap.entrySet()) {
            if (mapStr.getValue() != max) {
                li.add(mapStr.getValue());
            }
        }
        Integer maxLi = Collections.max(li);
        for (Map.Entry<String, Integer> mapStr : strMap.entrySet()) {
            if (mapStr.getValue().equals(maxLi)) {
                repeated.append(mapStr.getKey());
            }
        }
        return repeated.toString();
    }

    public static void main(String[] args) {
        String[] strArr = { "ccc", "aaa", "ccc", "ddd", "aaa", "aaa" };
        String secondRepeated = findSecondRepeatedWord(strArr);
        System.out.println(secondRepeated);
    }
}
