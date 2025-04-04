package Java8;

    /*
    Question:
    Given a list of words, find the longest word(s) using Stream API.

    Example Input:
    List<String> words = Arrays.asList("apple", "banana", "strawberry", "kiwi");

    Expected Output:
    ["strawberry"]
     */


import java.util.Arrays;
import java.util.List;

public class FindTheWordWithMaxLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "strawberry", "kiwi");

        String s = words.stream()
                .max(String :: compareTo).get();
        System.out.println(s);
    }
}
