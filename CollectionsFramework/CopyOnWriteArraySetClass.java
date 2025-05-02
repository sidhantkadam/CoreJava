package CollectionsFramework;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetClass {
    public static void main(String[] args) {
        Set<Integer> set = new CopyOnWriteArraySet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        Thread readerThread = new Thread(() -> {
            System.out.println("Read Operations: ");
            for (Integer i : set) {
                System.out.print(i + " ");
            }
        });

        Thread writerThread = new Thread(() -> {
            System.out.println("Write Operations: ");
            set.add(6);
        });
        readerThread.start();
        writerThread.start();
    }
}
