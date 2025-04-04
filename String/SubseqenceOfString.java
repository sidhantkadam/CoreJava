package String;

public class SubseqenceOfString {
    public static boolean checkSubsequence(String s1, String s2, int m, int n) {
        if (m == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }

        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return checkSubsequence(s1, s2, m - 1, n - 1);
        }
        return checkSubsequence(s1, s2, m, n - 1);
    }

    public static void main(String[] args) {
        String s1 = "AXY";
        String s2 = "ADXCPY";
        int m = s1.length();
        int n = s2.length();
        System.out.println(checkSubsequence(s1, s2, m, n));
    }
}
