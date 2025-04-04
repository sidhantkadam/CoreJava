import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWordFrequency
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence : ");
        String sent = sc.nextLine();
        String[] sentenceToWord = sent.split(" ");

        Map<String, Integer> countWords = new HashMap<>();
        for(String st : sentenceToWord)
        {
            countWords.put(st, countWords.getOrDefault(st,0) + 1);
        }

        for(Map.Entry<String , Integer> finalMap : countWords.entrySet())
        {
            System.out.println("Word :" + finalMap.getKey() + "\t" +"Count :"+ finalMap.getValue());
        }
    }
}
