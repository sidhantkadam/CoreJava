import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNo
{
    public static void main(String[] args)
    {
        List<Integer> listNo = Arrays.asList(5,7,3,8,11);

        Optional<Integer> Max = listNo
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(Max);
    }
}
