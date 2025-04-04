package FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountTheWordWithHighFrequency {
    public static void main(String[] args) {
        int count = 0;
        String mostRepeatedWord = null;

        Map<String, Integer> finalMap = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("F:\\Java\\Projects\\Core Java\\FileIO\\text.txt"));
            String lineReader = reader.readLine();

            while (lineReader != null) {
                String[] strArray = lineReader.split(" ");
                for (String word : strArray) {
                    if (finalMap.containsKey(word)) {
                        finalMap.put(word, finalMap.get(word) + 1);
                    } else {
                        finalMap.put(word, 1);
                    }
                }
                lineReader = reader.readLine();
            }

            for (Map.Entry<String, Integer> entrySet : finalMap.entrySet()) {
                if (entrySet.getValue() > count) {
                    mostRepeatedWord = entrySet.getKey();
                    count = entrySet.getValue();
                }
            }
            System.out.println("Most repeated word : " + mostRepeatedWord);
            System.out.println("Count : " + count);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
