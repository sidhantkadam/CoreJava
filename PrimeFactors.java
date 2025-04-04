import java.util.ArrayList;
import java.util.List;

public class PrimeFactors
{
    //12 =  2*2*3;

    // 2 3 4 6

    public static void checkPrime(int n)
    {
        List<Integer> prime = new ArrayList<>();
        while (n % 2 == 0)
        {
            prime.add(2);
            n/= 2;
        }
        for(int i=3;i<n; i=i+2)
        {
            if(n%i==0)
            {
                    prime.add(i);
                    n/=i;
            }
        }
        if(n>2)
        {
            prime.add(n);
        }
        prime.forEach(System.out::println);
    }

    public static void main(String[] args)
    {
        int n=49;
        checkPrime(n);
    }
}
