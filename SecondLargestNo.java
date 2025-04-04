import java.util.Arrays;
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
                .sorted((o1, o2) -> o2 - o1)
                .skip(1)
                .findFirst();
        System.out.println(Max);
    }
}
