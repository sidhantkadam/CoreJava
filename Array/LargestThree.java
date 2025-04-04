package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestThree {
    public static List<Integer> findLargestThreeByThreeTraversal(List<Integer> li) {
        List<Integer> threeMax = new ArrayList<>();
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;

        for (Integer i : li) {
            if (i > firstMax) {
                firstMax = i;
            }
        }
        for (Integer i : li) {
            if (i < firstMax && i > secondMax) {
                secondMax = i;
            }
        }
        for (Integer i : li) {
            if (i < firstMax && i < secondMax && i > thirdMax) {
                thirdMax = i;
            }
        }
        threeMax.add(firstMax);
        threeMax.add(secondMax);
        threeMax.add(thirdMax);
        return threeMax;
    }

    private static List<Integer> findLargestThreeByOneTraversal(List<Integer> li) {
        List<Integer> maxNum = new ArrayList<>();

        int firstMax = -1, secondMax = -1, thirdMax = -1;
        for (Integer x : li) {
            if (x > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = x;
            } else if (x > secondMax && x != firstMax) {
                thirdMax = secondMax;
                secondMax = x;
            } else if (x > thirdMax && x != firstMax && x != secondMax) {
                thirdMax = x;
            }
        }
        maxNum.add(firstMax);
        maxNum.add(secondMax);
        maxNum.add(thirdMax);
        return maxNum;
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(10, 4, 30, 50, 23, 90);
        System.out.println(findLargestThreeByThreeTraversal(li));
        System.out.println(findLargestThreeByOneTraversal(li));
    }
}
