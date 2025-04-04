package InterviewOrExams;

public class IBM_UIClassValidation {
    private static int validateTokens(String s) {
        String[] tokens = s.split(" ");
        int validCounts = 0;

        for (String token : tokens) {
            if (isValid(token)) {
                validCounts++;
            }
        }
        return validCounts;
    }

    private static boolean isValid(String token) {
        if (token.length() < 3) {
            return false;
        }
        if (!token.matches("[a-zA-Z0-9]+")) {
            return false;
        }
        if (!token.matches(".*[aeiouAEIOU].*")) {
            return false;
        }
        if (!token.matches(".*[bcdfghjklmnprstvwxyzBCDFGHJKLMNPQRSTVWXYZ].*")) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "This is major16 machine with some expiry";
        int count = validateTokens(s);
        System.out.println(count);
    }
}
