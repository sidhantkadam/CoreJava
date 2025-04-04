package String;


public class SubStringCountStartAndEndWith1 {
    private static int countSubString(String s) {
        int countSubString = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == '1') {
                        countSubString++;
                    }
                }
            }
        }
        return countSubString;
    }

    public static void main(String[] args) {
        String s = "00100101";
        int count = countSubString(s);
        System.out.println(count);
    }
}
