package Multithreading.ExecutorFramework12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

    /*
        Creates new threads as needed, reuses idle threads.
        Suitable for short-lived async tasks.
    */

public class ExecutorWithCachedThreadPool {
    public static void main(String[] args) {
        ExecutorService cached = Executors.newCachedThreadPool();

        for (int i = 1; i <= 5; i++) {
            int finalI = i;
            cached.submit(() -> {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Cached Task : " + Thread.currentThread().threadId() + " With Task Id: " + finalI);
            });
        }
        cached.shutdown();
    }
}
