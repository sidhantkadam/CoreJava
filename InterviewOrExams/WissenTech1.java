package InterviewOrExams;

import java.util.Arrays;

public class WissenTech1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};

        for (int i = 1; i < a.length - 1; i += 2) {
            if (a[i - 1] < a[i]) {
                int temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;
            }
            if (a[i + 1] < a[i]) {
                int temp1 = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp1;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
