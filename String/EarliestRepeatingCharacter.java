package String;

public class EarliestRepeatingCharacter {

    public static String checkAndReturnDuplicate(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return Character.toString(s.charAt(i));
                }
            }
        }
        return "-1";
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(checkAndReturnDuplicate(s));
    }
}