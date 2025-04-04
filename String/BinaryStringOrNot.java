package String;

public class BinaryStringOrNot {
    private static boolean checkBinary(String s) {
        for (Character c : s.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "0101010100";
        System.out.println(checkBinary(s));
    }
}
