package Java8.DefaultAndStatic;

import java.util.Arrays;
import java.util.List;

public class MultiplicationClient {
    public static void main(String[] args) {
        MultiplierInterface multiplier = new MultiplierInterfaceImpl();
        List<Integer> li = Arrays.asList(1, 3, 5);

        System.out.println("Multiplication : " + multiplier.multiply(li));
        System.out.println("Size of the list : " + multiplier.sizeOfList(li));

        System.out.println("Check list size : " + MultiplierInterface.listIsEmpty(li));

        InterfaceImplClass aClass = new InterfaceImplClass();
        aClass.print();
    }
}

