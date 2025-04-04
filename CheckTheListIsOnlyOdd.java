import java.util.Arrays;
import java.util.List;

public class CheckTheListIsOnlyOdd {
    public static boolean checkAllOddOrNot(List<Integer> li) {
        for (int i : li) {
            if (i % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(3, 5, 7, 2);
        System.out.println(checkAllOddOrNot(li));
    }
}
