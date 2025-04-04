package String;

public class CountEqualPairs {

    private static int countEqualPairs(String s) {
        int count = 0;
        char[] charArray = s.toCharArray();
        for (char value : charArray) {
            for (char c : charArray) {
                if (value == c) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int count = countEqualPairs(s);
        System.out.println(count);
    }
}
