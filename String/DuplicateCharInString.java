package String;

import java.util.*;

public class DuplicateCharInString {

    public static void main(String[] args) {
        String s = "abcdabd";
        findDuplicateCharInString(s);
        System.out.println("***********");
        traditionalApproach(s);
    }

    private static void traditionalApproach(String s) {
        int[] count = new int[256];

        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            count[charArray[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + ":" + count[i]);
            }
        }
    }

    private static void findDuplicateCharInString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entryMap : map.entrySet()) {
            if (entryMap.getValue() > 1) {
                System.out.println(entryMap.getKey() + ":" + entryMap.getValue());
            }
        }
    }
}
