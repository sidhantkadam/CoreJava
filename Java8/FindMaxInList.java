package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class FindMaxInList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 12, 14, 16, 18, 20);
        int[] arr = new int[]{10, 12, 14, 16, 18, 20};

        //max using max method
        int asInt = nums.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
        System.out.println(asInt);

        //max value using Comparator.comparingInt method
        int max = nums.stream()
                .max(Comparator.comparingInt(Integer::valueOf))
                .get();
        System.out.println(max);

        //max value from arrays using max method with optional
        OptionalInt asInt1 = Arrays.stream(arr)
                .max();
        asInt1.ifPresent(maxx -> System.out.println("Maxx : " + maxx));

        //max value using sorted and Comparator interface
        int maxNum = nums.stream()
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .get();
        System.out.println(maxNum);

        //min using min method
        int asIntMin = nums.stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt();
        System.out.println(asIntMin);

        //min value using Comparator.comparingInt method
        int min = nums.stream()
                .min(Comparator.comparingInt(Integer::valueOf))
                .get();
        System.out.println(min);

        //min value from arrays using min method with optional
        OptionalInt asInt1Min = Arrays.stream(arr)
                .min();
        asInt1Min.ifPresent(minn -> System.out.println("Min : " + minn));
    }
}
