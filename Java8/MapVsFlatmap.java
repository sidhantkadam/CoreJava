package Java8;

import java.util.Arrays;
import java.util.List;

public class MapVsFlatmap {
    public static void main(String[] args) {
        List<String> numbersInString = Arrays.asList("20", "40", "80", "160");

        List<Integer> list = numbersInString.stream()
                                .map(Integer::valueOf)
                                .toList();
        System.out.println(list);


        List<List<Integer>> table = Arrays.asList(
                Arrays.asList(2,4,6,8,10),
                Arrays.asList(12,14,16,18,20),
                Arrays.asList(22,24,26,28,30)
        );
        List<Integer> list1 = table.stream()
                                .flatMap(List::stream)
                                .toList();

        System.out.println(list1);
    }
}
