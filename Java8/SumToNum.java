package Java8;

interface Sum
{
    public abstract int sumTwoNum(int a, int b);
}

public class SumToNum
{
    public static void main(String[] args)
    {
        Sum sum = (x,y) -> x+y;
        int finalR = sum.sumTwoNum(3,4);
        System.out.println(finalR);
    }
}
