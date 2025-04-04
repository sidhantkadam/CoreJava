package Java8;

import java.util.*;

public class CountRepeatedCharInString {
    private static void countOfRepeatedCharInString(List<String> s) {
        for (String string : s) {
            Map<Character, Integer> countChar = new HashMap<>();
            for (char c : string.toLowerCase().toCharArray()) {
                countChar.put(c, countChar.getOrDefault(c, 0) + 1);
            }
            System.out.println("Word :" + string);
            for (Map.Entry<Character, Integer> duplicateCount : countChar.entrySet()) {
                if (duplicateCount.getValue() > 1) {
                    System.out.println("Duplicate Char : " + duplicateCount.getKey() +", "+ "Count : " + duplicateCount.getValue());
                }
            }
        }
    }

    public static void main(String[] args) {
        List<String> s = Arrays.asList("Google", "Apple", "Siddhant");
        countOfRepeatedCharInString(s);
    }
}
