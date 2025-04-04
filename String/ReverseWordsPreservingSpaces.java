package String;

//input: "Hello World Java";
//output: "olleH dlroW avaJ";

public class ReverseWordsPreservingSpaces {
    public static void main(String[] args) {
        String s = "Hello World Java";

        String reverseWithSpace = reverseWordsPreservingSpaces(s);
        System.out.println(reverseWithSpace);
    }

    private static String reverseWordsPreservingSpaces(String s) {
        StringBuilder reverse = new StringBuilder();
        String[] s1 = s.split(" ");

        for (String str : s1) {
            char[] charArray = str.toCharArray();
            for (int i = charArray.length - 1; i >= 0; i--) {
                reverse.append(charArray[i]);
            }
            reverse.append(" ");
        }
        return reverse.toString();
    }
}
