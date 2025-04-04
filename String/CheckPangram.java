package String;

import java.util.HashSet;
import java.util.Set;

public class CheckPangram {
    public static boolean checkPangram(String s) {
        String lowerCase = s.toLowerCase();
        String check = "abcdefghijklmnopqrstuvwxyz";

        Set<Character> letters = new HashSet<>();
        for (Character c : lowerCase.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }
        System.out.println(letters);
        return letters.containsAll(convertStringToSet(check));
    }

    private static Set<Character> convertStringToSet(String str) {
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        return set;
    }

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(checkPangram(s));
    }
}
