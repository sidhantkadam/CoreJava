package Java8;

import java.util.Arrays;
import java.util.List;

public class FindMaxInList
{
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(64,30,1875,100);

        Integer max = l.stream().max(Integer::compareTo).get();
        System.out.println(max);
    }
}
