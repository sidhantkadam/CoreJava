package String;

public class PalindromeIgnoringNonAlphanumeric {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";

        boolean result = isPalindromeIgnoringNonAlphanumeric(input);
        System.out.println(result);
    }

    private static boolean isPalindromeIgnoringNonAlphanumeric(String input) {
        StringBuilder sb = new StringBuilder();

        for (char c : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }
        return sb.toString().contentEquals(sb.reverse());
    }
}
