package String;

public class FindTheCountOfSpecialCharInString {
    public static void main(String[] args) {
        String s = "TechCloud&*^";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i)) && !Character.isLetter(s.charAt(i))) {
                count++;
            }
        }
        if (count == 0)
            System.out.println("No Special Char in String !");
        System.out.println(count);
    }
}
