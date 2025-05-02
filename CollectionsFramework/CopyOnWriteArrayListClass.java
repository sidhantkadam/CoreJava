package CollectionsFramework;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListClass {
    public static void main(String[] args) {
        List<Integer> li = new CopyOnWriteArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);

        Thread readerThread = new Thread(() -> {
            System.out.println("Read Operations: ");
            for (Integer i : li) {
                System.out.print(i + " ");
            }
        });

        Thread writerThread = new Thread(() -> {
            System.out.println("Write Operations: ");
            li.add(6);
        });
        readerThread.start();
        writerThread.start();
    }
}
