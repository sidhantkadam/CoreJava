package String;


public class SubstringOfString {
    private static int checkSubStringOfString(String s, String pat) {
//        for(int i=0;i<s.length();i++) {
//            if (s.contains(pat)) {
//                return s.indexOf(pat);
//            }
//        }
//        return -1;

        int n = s.length();
        int m = pat.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (s.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "google";
        String pat = "g";
        System.out.println(checkSubStringOfString(s, pat));
    }
}
