package Multithreading.ExecutorFramework12;

    /*
        Only one thread handles tasks.
        Tasks are executed sequentially.
    */

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorWithSingleThreadExecutor {
    public static void main(String[] args) {

        ExecutorService single = Executors.newSingleThreadExecutor();
        for (int i = 1; i <= 4; i++) {
            int finalI = i;
            Future<?> submit = single.submit(() -> {
                System.out.println(Thread.currentThread().getName() + finalI);
                return "Hello";
            });
            try {
                System.out.println(submit.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        single.shutdown();
    }
}
