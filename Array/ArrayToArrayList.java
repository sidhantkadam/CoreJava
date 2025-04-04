package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 5};
        List<int[]> list = List.of(arr);
        for (int[] i : list) {
            System.out.println(Arrays.toString(i));
        }

        ArrayList<String> li = new ArrayList<>();
        li.add("Hi");
        li.add("Hi");
        li.add("Hello");
        li.add("Bye");
        String[] arr1 = new String[li.size()];
        String[] array = li.toArray(arr1);
        System.out.println(Arrays.toString(array));
    }
}
