
public class CreateOTP {

    public static int generateOtp() {
        return (int) (Math.random() * 9000) + 1000;
    }

    public static void main(String[] args) {
        System.out.println(generateOtp());
    }
}
