package String;

import java.util.Objects;

public class DuplicateWordsInString {
    public static void main(String[] args) {
        String s = "up the sky sky sky up down the earth";
        int count;
        String[] s1 = s.trim().split(" ");

        boolean[] visited = new boolean[s1.length];
        for (int i = 0; i < s1.length; i++) {
            String word = s1[i];
            if (!visited[i]) {
                count = 1;
                for (int j = i + 1; j < s1.length - 1; j++) {
                    if (Objects.equals(word, s1[j])) {
                        count++;
                        visited[j] = true;
                    }
                }
                if (count > 1) {
                    System.out.println(s1[i] + " " + count);
                }
            }
        }
    }
}
