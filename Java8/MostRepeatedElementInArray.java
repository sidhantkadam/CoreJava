package Java8;

import java.util.*;

public class MostRepeatedElementInArray {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil");

        Map<String, Integer> strMap = new HashMap<>();
        for (String s : listOfStrings) {
            strMap.put(s, strMap.getOrDefault(s, 0) + 1);
        }

        Map.Entry<String, Integer> max = strMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(max);
    }
}
