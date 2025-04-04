package String;

public class ReverseEachWordsAlphabetsInString {
    public static void main(String[] args) {
        String s = "Sore was I ere I saw Eros";

        for (String str : s.split(" ")) {
            for (int i = str.length() - 1; i >= 0; --i) {
                System.out.print(str.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
