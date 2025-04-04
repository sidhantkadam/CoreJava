package String;

public class SortTheCharacters {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        StringBuilder sorted = new StringBuilder();

        final String alphabets = "abcdefghijklmnopqrstuvwxyz";

        char[] charArray = alphabets.toCharArray();
        for (char value : charArray) {
            for (char c : s.toCharArray()) {
                if (c == value) {
                    sorted.append(c);
                }
            }
        }
        System.out.println(sorted);
    }
}

