package Java8.DefaultAndStatic;

import java.util.List;

public interface MultiplierInterface {
    int multiply(List<Integer> li);

    default int sizeOfList(List<Integer> li) {
        System.out.println("From Interface : ");
        return li.size();
    }

    static boolean listIsEmpty(List<Integer> li) {
        return li != null && li.size() > 0;
    }
}
