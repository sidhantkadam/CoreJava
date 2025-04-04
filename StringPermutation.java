import java.util.Scanner;

public class StringPermutation
{
    static void swap(StringBuilder sb, int i, int j)
    {
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
    }

    private static void doPermutation(StringBuilder sb, int idx)
    {
        if (idx == sb.length() - 1)
        {
            System.out.println(sb);
            return;
        }

        for(int i=idx; i<sb.length();i++)
        {
            swap(sb, idx, i);
            doPermutation(sb,idx+1);
            swap(sb, idx, i);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st OPPs.Main String : ");
        StringBuilder sm = new StringBuilder(sc.next());
        doPermutation(sm,0);
    }
}
