import java.util.ArrayList;
import java.util.List;

public class ModifiedFinalList
{
    public static void main(String[] args) {
        final List<Integer> num = new ArrayList<>();

        num.add(100);
        num.add(100);
        System.out.println(num);
    }
}
