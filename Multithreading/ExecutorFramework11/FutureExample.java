package Multithreading.ExecutorFramework11;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);

        Future<Integer> submit = service.submit(() -> 5 * 4);                    //Callable
        System.out.println(submit.get());

        Future<?> hello = service.submit(() -> System.out.println("Hello"));     //Runnable
        System.out.println(hello.get());

        Future<?> change = service.submit(() -> {                                //Runnable with Result as return
            System.out.println("Task");
        }, "SUCCESS");
        System.out.println(change.get());

        System.out.println(service.isShutdown());
        System.out.println(service.isTerminated());
        System.out.println(service.awaitTermination(1000, TimeUnit.MILLISECONDS));
        service.shutdown();
    }
}
