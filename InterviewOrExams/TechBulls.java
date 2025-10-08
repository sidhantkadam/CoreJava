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
                char temp1 = s.charAt(f);
                char temp2 = s.charAt(l);
                sb.setCharAt(f, temp2);
                sb.setCharAt(l, temp1);
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
