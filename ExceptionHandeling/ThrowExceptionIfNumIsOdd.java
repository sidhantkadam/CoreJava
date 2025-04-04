package ExceptionHandeling;

public class ThrowExceptionIfNumIsOdd {
    public static void methodCall(int n) {
        try {
            if (n % 2 != 0) {
                throw new IllegalArgumentException("Failed the case!, " + n + " is Odd");
            } else {
                System.out.println("Passed the case :)");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Exception Occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int n = 226;
        methodCall(n);
        n = 23;
        methodCall(n);
        n = 212;
        methodCall(n);
    }
}
