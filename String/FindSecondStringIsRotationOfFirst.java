package String;

public class FindSecondStringIsRotationOfFirst
{
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";

        String append = s1+s1;

        if(append.contains(s2))
        {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
