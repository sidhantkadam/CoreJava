package InterviewOrExams;

import java.util.*;

public class WissenTechInterview1 {

    public static List<List<String>> groupAnagrams(String[] input) {

        Map<String, List<String>> strs = new HashMap<>();

        for (String str : input) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = Arrays.toString(charArray);
            List<String> orDefault = strs.getOrDefault(sortedString, new ArrayList<>());
            orDefault.add(str);
            strs.put(sortedString, orDefault);
        }
        return new ArrayList<>(strs.values());
    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(input);
        System.out.println(lists);
    }
}
