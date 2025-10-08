package Java8.DefaultAndStatic;

import java.util.List;

public class MultiplierInterfaceImpl implements MultiplierInterface {
    @Override
    public int multiply(List<Integer> li) {
        return li.stream()
                .reduce(1, (x, y) -> x * y);
    }

    @Override
    public int sizeOfList(List<Integer> li) {
        System.out.println("From Impl Class : ");
        return li.size();
    }
}
