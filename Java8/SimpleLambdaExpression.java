package Java8;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Sample {
    Integer findMin(List<Integer> list);
}

public class SimpleLambdaExpression {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20, 30, 40, 50);
        Sample sample = list1 -> list1.stream().min(Integer::compareTo).get();
        Integer min = sample.findMin(list);
        System.out.println("Min:" + min);
    }
}
