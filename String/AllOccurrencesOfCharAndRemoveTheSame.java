package String;

public class AllOccurrencesOfCharAndRemoveTheSame {
    public static void main(String[] args) {
        String s = "TechCloud";
        StringBuilder returnStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == 'C' || c == 'c') {
                System.out.println(s.indexOf(c));
            } else {
                returnStr.append(c);
            }
        }
        System.out.println(returnStr);
    }
}
