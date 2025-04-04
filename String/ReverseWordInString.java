package String;


public class ReverseWordInString {
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";

        StringBuilder reverse = new StringBuilder();

        String[] split = str.split("\\.");
        for (int i = split.length - 1; i >= 0; --i) {
            reverse.append(split[i]);
            if (i >= 1) {
                reverse.append(".");
            }
        }
        System.out.println(reverse);
    }
}
