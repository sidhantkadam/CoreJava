package Java8;

import java.util.*;

    /*
        Input: List<String> s = Arrays.asList("Google", "Apple", "Siddhant");

        Output:
        Word :Google
        Duplicate Char : g, Count : 2
        Duplicate Char : o, Count : 2
        Word :Apple
        Duplicate Char : p, Count : 2
        Word :Siddhant
        Duplicate Char : d, Count : 2
    */

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
