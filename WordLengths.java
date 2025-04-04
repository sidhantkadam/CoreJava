import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordLengths
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence : ");
        String[] arrString = sc.nextLine().split(" ");

        Map<String, Integer> map = new HashMap<>();
        for(String word : arrString)
        {
            map.put(word, word.length());
        }

        for(Map.Entry<String ,Integer> finalMap : map.entrySet())
        {
            System.out.println("Word :" + finalMap.getKey() + "\t" +"Length :"+ finalMap.getValue());
        }
    }
}
