package String;

import java.util.*;

public class FirstNonRepeatingCharacter {
    private static char firstNonRepeating(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; ++i) {
            boolean flag = false;
            for (int j = 0; j < charArray.length; ++j) {
                if (i != j && charArray[i] == charArray[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return charArray[i];
            }
        }
        return '$';
    }

    public static char findFirstNonRepeatingCharacter(String s) {
        Map<Character, Integer> mp = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        System.out.println(mp);

        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char c = firstNonRepeating(s);
        System.out.println(c);

        char ch = findFirstNonRepeatingCharacter(s);
        System.out.println(ch);
    }
}
