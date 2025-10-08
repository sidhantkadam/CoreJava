package InterviewOrExams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NaptuneUbicom2 {

    public static List<Integer> anagramDiff(List<String> str1, List<String> str2) {
        List<Integer> returnLi = new ArrayList<>();

        for (int i = 0; i < str1.size(); i++) {
            String s1 = str1.get(i);
            String s2 = str2.get(i);

            if (s1.length() != s2.length()) {
                returnLi.add(-1);
                continue;
            }

            int[] feq = new int[26];
            for (char c : s1.toCharArray()) {
                feq[c - 'a']++;
            }
            for (char c : s2.toCharArray()) {
                feq[c - 'a']--;
            }
            int diff = 0;
            for (int j = 0; j < 26; j++) {
                diff += Math.abs(feq[j]);
            }
            returnLi.add(diff / 2);
        }
        return returnLi;
    }

    public static void main(String[] args) {
        List<String> str1 = Arrays.asList("a", "jk", "abb", "mn", "abc");
        List<String> str2 = Arrays.asList("bb", "kj", "bbc", "op", "def");

        List<Integer> list = anagramDiff(str1, str2);
        System.out.println(list);
    }
}
