package InterviewOrExams;

public class ZensarCode1 {
    public static String calculateRegularAndOvertimePay(double[] arr) {
        double start = arr[0];
        double end = arr[1];
        double hourlyPay = arr[2];
        double overTimePayMultiplier = arr[3];

        double totalPayout;
        String output = "";

        if (start == 0 || end == 0) {
            output = "$" + 0;
        } else if (end <= 17) {
            int totalTime = (int) (end - start);
            totalPayout = totalTime * hourlyPay;
            output = "$" + totalPayout;
        } else if (end > 17) {
            int totalRegularTime = (int) (17 - start);
            int totalRegularPayout = totalRegularTime * 30;
            int totalOverTime = (int) end - 17;
            double totalOverTimePay = totalOverTime * 30 * overTimePayMultiplier;
            totalPayout = totalRegularPayout + totalOverTimePay;
            if (totalPayout % 10 == 5) {
                totalPayout = totalPayout + 5;
            }
            output = "$" + totalPayout;
        }
        return output;
    }

    public static void main(String[] args) {
        double[] arr1 = {9, 17, 30, 1.5};
        double[] arr2 = {16, 18, 30, 1.5};
        double[] arr3 = {0, 12, 30, 1.5};

        String output1 = calculateRegularAndOvertimePay(arr1);
        String output2 = calculateRegularAndOvertimePay(arr2);
        String output3 = calculateRegularAndOvertimePay(arr3);
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
    }
}
