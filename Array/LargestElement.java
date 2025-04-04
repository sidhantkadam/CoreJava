package Array;

import java.util.Arrays;
import java.util.List;

public class LargestElement {
    public static int findLargestElement(List<Integer> li) {
        int max = Integer.MIN_VALUE;
        for(Integer num : li)
        {
            if(max < num)
            {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(100, 10000, 6000);
        System.out.println(findLargestElement(li));
    }
}
