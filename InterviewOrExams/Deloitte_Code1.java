package InterviewOrExams;

import java.util.Arrays;
import java.util.Stack;

public class Deloitte_Code1 {

    public static void stackApproach(int[] arr) {
        int[] A1 = new int[arr.length];                // 9 9 -1 5 7 7 -1
        int[] A2 = new int[arr.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            A1[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        Stack<Integer> stack2 = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack2.isEmpty() && stack2.peek() > arr[i]) {
                stack2.pop();
            }
            A2[i] = stack2.isEmpty() ? 0 : stack2.peek();
            stack2.push(arr[i]);
        }
        System.out.println(Arrays.toString(A1));
        System.out.println(Arrays.toString(A2));
    }

    public static void brutForce(int[] arr) {


        int[] A1 = new int[arr.length];                // 9 9 -1 5 7 7 -1
        int[] A2 = new int[arr.length];                // 1 1  0 2 1 1  0

        for (int i = 0; i < arr.length; i++) {
            int index = arr[i];
            A1[i] = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > index) {
                    A1[i] = arr[j];
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int index = arr[i];
            A2[i] = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] <= index) {
                    A2[i] = arr[j];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(A1));
        System.out.println(Arrays.toString(A2));
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 2, 5, 1, 7};

        brutForce(arr);
        stackApproach(arr);
    }
}
