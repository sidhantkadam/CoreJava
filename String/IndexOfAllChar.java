package String;

public class IndexOfAllChar
{
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        char[] arr = s.toCharArray();
        for(char c : arr)
        {
            int i = s.indexOf(c);
            System.out.print(c + ":" + i + " ");
        }
    }
}
