import java.util.Arrays;
import java.util.Random;

//valid for some time is pending

public class OtpGeneratorValidForSomeTime {
    public static void main(String[] args) {
        Random ran = new Random();
        String numbers = "0123456789";
        char[] otp = new char[4];
        for (int i = 0; i < 4; i++) {
            otp[i] = numbers.charAt(ran.nextInt(numbers.length()));
        }
        System.out.println(Arrays.toString(otp));
    }
}
