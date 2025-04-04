package String;

public class Palindrome {
    private static int checkForPalindrome(String s) {
//        StringBuilder reverse = new StringBuilder();


//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            reverse.append(s.charAt(i));
//        }
//        if (s.contentEquals(reverse)) {
//            return 1;
//        } else {
//            return 0;
//        }
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return 0;
            }
            left++;
            right--;
        }
        return 1;
    }

    public static void main(String[] args) {
        String s = "aba";
        System.out.println(checkForPalindrome(s));
    }
}
