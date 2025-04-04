import java.util.Scanner;

public class CountVowels
{
    public static void countCharacters(String s)
    {
        int vowels =0, nonVowels = 0;
        for(char c : s.toCharArray())
        {
            if("AEIOUaeiou".indexOf(c)!=-1)
            {
                vowels++;
            }
            else
            {
                nonVowels++;
            }
        }
        System.out.println("Vowels : " + vowels);
        System.out.println("Non-vowels : " + nonVowels);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to count Vowels and Non-vowels : ");
        String s= sc.nextLine();
        countCharacters(s);
    }
}