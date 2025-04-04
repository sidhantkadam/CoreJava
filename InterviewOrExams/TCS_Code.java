package InterviewOrExams;

//from 1 - 100 find out the odd numbers and number divide by 3

import java.util.ArrayList;
import java.util.List;

public class TCS_Code {

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>(100);
        for (int i = 1; i <= 100; i++) {
            li.add(i);
        }

        List<Integer> list = li.stream()
                .filter(n -> (n % 2 != 0 && n % 3 == 0))
                .toList();
        System.out.println(list);
    }
}
