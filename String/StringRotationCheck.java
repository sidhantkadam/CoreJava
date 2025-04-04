package String;

    /*
    Input: "waterbottle", "erbottlewat"
    Output: true

    Input: "waterbottle", "botwaterlte"
    Output: false
    */

public class StringRotationCheck {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "botwaterlte";

        boolean result = checkRotation(s1, s2);
        System.out.println(result);
    }

    private static boolean checkRotation(String s1, String s2) {

        if (s1.length() == s2.length() && !s1.isEmpty()) {
            String both = s1 + s1;
            return both.contains(s2);
        }
        return false;
    }
}
