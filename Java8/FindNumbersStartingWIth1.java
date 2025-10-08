package Java8;

import java.util.Arrays;
import java.util.List;

public class FindNumbersStartingWIth1 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(11, 14, 18, 20, 25, 100, 12);
        List<Integer> list = li.stream()
                .filter(num -> String.valueOf(num)
                        .startsWith("1")).toList();
        System.out.println(list);
    }

}
