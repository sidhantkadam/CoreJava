package Java8;

interface CheckString
{
    boolean checkString(String s);
}

public class StringIsEmpty
{
    public static void main(String[] args)
    {
        CheckString check = (s) -> s.isEmpty();
        System.out.println(check.checkString(""));
    }
}
