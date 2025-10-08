import java.util.ArrayList;
import java.util.List;

public class CollectMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 9, 10, 12, 14, 15, 17, 20};

        List<Integer> li = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff > 1) {
                for (int j = 1; j <= diff - 1; j++) {
                    int value = arr[i - 1] + j;
                    li.add(value);
                }
            }
        }
        System.out.println(li);
    }
}
