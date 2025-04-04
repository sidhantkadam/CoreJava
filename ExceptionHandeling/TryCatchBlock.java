package ExceptionHandeling;

public class TryCatchBlock {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        try {
            int divide = j / i;
            System.out.println(divide);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
