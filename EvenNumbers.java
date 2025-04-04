import java.util.Arrays;
import java.util.List;

public class EvenNumbers
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(23, 45, 56, 89, 24, 100);
        List<Integer> evenList = numbers.stream()
                .filter(integer -> integer % 2 == 0).toList();
        System.out.println("Even Numbers : " + evenList);
        System.out.println("*****************");

        List<Integer> oddList = numbers.stream().filter(integer -> integer % 2 != 0).toList();
        System.out.println("Odd Numbers : " + oddList);
    }
}
