package InterviewOrExams;

// input - s#idd&h*an$t
// output- t#nah&d*di$s

public class TechBulls {
    public static StringBuilder reverseStringUsingStringBuilder(String s) {
        StringBuilder sb = new StringBuilder(s);
        int f = 0;
        int l = s.length() - 1;
        while (f < l) {
            if (!Character.isLetter(s.charAt(l))) {
                l--;
            } else if (!Character.isLetter(s.charAt(f))) {
                f++;
            } else {
                char temp = s.charAt(f);
                sb.setCharAt(f, s.charAt(l));
                sb.setCharAt(l, temp);
                f++;
                l--;
            }
        }
        return sb;
    }

    public static void main(String[] args) {
        String s = "s#idd&h*an$t";
        StringBuilder result = reverseStringUsingStringBuilder(s);
        System.out.println(result);
    }
}
