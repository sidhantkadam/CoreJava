package InterviewOrExams;

import java.util.*;

public class WissenTechR2Q2 {
    public static void main(String[] args) {
        String s = "gbhhndkklhh";

        Map<Character, Integer> counts = new HashMap<>();

        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        List<Character> li = new ArrayList<>(counts.keySet());
        li.sort((char1, char2) ->
                Integer.compare(counts.get(char2), counts.get(char1))
        );
        StringBuilder sb = new StringBuilder();
        for (char c : li) {
            sb.append(String.valueOf(c).repeat(counts.get(c)));
        }
        System.out.println(sb);
    }
}
