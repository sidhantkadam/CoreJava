package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningEvenAndOdd {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(12, 45, 22, 1, 28, 66, 79);

        Map<Boolean, List<Integer>> collect = li.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println(collect);

        System.out.println("Even : " + collect.get(true));
        System.out.println("Odd : " + collect.get(false));

        int[] arr = new int[]{12, 45, 22, 1, 28, 66, 79};
        Map<Boolean, List<Integer>> collect1 = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        System.out.println("Even : " + collect1.get(true));
        System.out.println("Odd : " + collect1.get(false));
    }
}
