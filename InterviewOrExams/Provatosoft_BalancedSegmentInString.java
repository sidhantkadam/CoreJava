package InterviewOrExams;

public class Provatosoft_BalancedSegmentInString {

    private static int checkEachLAndR(String s) {
        int count = 0;
        int check = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                count++;
            } else if (c == 'R') {
                count--;
            }
            if (count == 0) {
                check++;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        String s = "LLRRRRLLLRLLRRRLL";
        System.out.println(checkEachLAndR(s));
    }
}
