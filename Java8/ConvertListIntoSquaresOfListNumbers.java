package Java8;

import java.util.Arrays;
import java.util.List;

public class ConvertListIntoSquaresOfListNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int[] arr = new int[]{1, 2, 3, 4, 5};

        List<Integer> list1 = list.stream()
                .map(num -> num * num)
                .toList();
        System.out.println("List : " + list1);

        int[] array = Arrays.stream(arr)
                .mapToDouble(num -> Math.pow(num, 2))
                .mapToInt(doubleNum -> (int) doubleNum)
                .toArray();
        System.out.println("Arrays : " + Arrays.toString(array));
    }
}
