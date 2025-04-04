package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlternateElementsOfArray {
    public static List<Integer> printAlternateElements(List<Integer> li) {
        List<Integer> returnLi = new ArrayList<>();
        for (int i = 0; i < li.size(); i = i + 2) {
            returnLi.add(li.get(i));
        }
        return returnLi;
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println(printAlternateElements(li));
    }
}
