package Array;

import java.util.*;

public class LeadersInArray {
    private static List<Integer> findLeaderElementNestedLoop(List<Integer> li) {
        List<Integer> returnLi = new ArrayList<>();
        for (int i = 0; i < li.size(); i++) {
            int j;
            for (j = i + 1; j < li.size(); j++) {
                if (li.get(j) > li.get(i)) {
                    break;
                }
            }
            if (j == li.size()) {
                returnLi.add(li.get(i));
            }
        }
        return returnLi;
    }

    private static List<Integer> findLeaderElementSuffixMaximum(List<Integer> li) {
        List<Integer> returnLi = new ArrayList<>();
        int maxRight = li.getLast();
        returnLi.add(maxRight);
        for (int i = li.size() - 2; i >= 0; i--) {
            if (li.get(i) >= maxRight) {
                maxRight = li.get(i);
                returnLi.add(maxRight);
            }
        }
        Collections.reverse(returnLi);
        return returnLi;
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(16, 17, 4, 3, 5, 2);
        List<Integer> leaders = findLeaderElementNestedLoop(li);
        List<Integer> leader = findLeaderElementSuffixMaximum(li);
        System.out.println(leaders);
        System.out.println(leader);
    }
}
