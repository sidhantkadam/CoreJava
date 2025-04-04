package Array;

import java.util.Arrays;
import java.util.List;

public class LinearSearch {
    public static String searchElement(int x, List<Integer> li) {
        String index = "";
        for(Integer i : li)
        {
            if(i==x)
            {
                index =  String.valueOf(li.indexOf(i));
            }
            else {
                index = "Not Present";
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int x = 100;
        List<Integer> li = Arrays.asList(10, 40, 60, 2, 80);
        System.out.println(searchElement(x,li));
    }
}
