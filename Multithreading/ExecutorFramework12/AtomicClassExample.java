package Multithreading.ExecutorFramework12;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
//    private int counter = 0;            /*By making the variable as volatile still it's not taking the value of it from main memory. It's called Atomicity*/

    private final AtomicInteger integer = new AtomicInteger(0);         //Solution: By defining the variable as AtomicInteger which is thread safe

    public void incrementCounter() {
        integer.incrementAndGet();
    }

    public int getCounter() {
        return integer.get();
    }
}

public class AtomicClassExample {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.incrementCounter();
            }
        });

        Thread th2 = new Thread(() -> {
            for (int j = 0; j < 10000; j++) {
                counter.incrementCounter();
            }
        });

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println(counter.getCounter());
    }
}
