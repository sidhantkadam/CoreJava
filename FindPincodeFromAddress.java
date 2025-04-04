import java.util.Arrays;

public class FindPincodeFromAddress {
    public static void main(String[] args) {
        String address = "4-158/9, 5th Cross Road, Sainikpuri, Secunderabad, 500094, TS, IND";

        String[] split = address.split(",");
        System.out.println(Arrays.toString(split));

        for (String s : split) {
            s = s.trim();
            if (s.length() == 6 && checkChar(s)) {
                System.out.println(s.trim());
            }
        }
    }

    private static boolean checkChar(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
