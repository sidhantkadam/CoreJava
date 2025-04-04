package String;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static boolean checkAnagrams(String s1, String s2) {

        Map<Character, Integer> map = new HashMap<>();

        for (Character c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Character c : s2.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        for (var entrySet : map.entrySet()) {
            if (entrySet.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseea";

        System.out.println(checkAnagrams(s1, s2));
    }
}
