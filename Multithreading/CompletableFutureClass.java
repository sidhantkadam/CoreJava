package Multithreading;

import java.util.concurrent.*;

    /*
        CompletableFuture is a class in Java used for asynchronous programming. It represents
        a task that is running in the background and will eventually complete, providing a
        powerful, non-blocking way to handle the result of that task when it becomes available.
    */

public class CompletableFutureClass {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + " Executed !");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Ok";
        }, executor).orTimeout(1, TimeUnit.MILLISECONDS);

        CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + " Executed !");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Ok";
        }, executor);
        System.out.println("Main");
        String s1 = cf1.exceptionally(s -> "Handled").get();
        String s = cf2.get();
        System.out.println(s1);
        System.out.println(s);
        executor.shutdown();
    }
}
