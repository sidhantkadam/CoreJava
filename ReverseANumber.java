public class ReverseANumber {
    public static void main(String[] args) {
        int num = 36456346;

        while (num > 0)
        {
            int digit = num % 10;
            System.out.print(digit);
            num = num / 10;
        }
    }
}
