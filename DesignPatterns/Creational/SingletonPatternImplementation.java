package DesignPatterns.Creational;

    /*
        Thread Pool Management:
            Scenario: Managing a pool of threads for executing tasks.
            Benefit: A singleton thread pool manager can control the number of threads,
            manage task queues, and optimize resource utilization across the application.
    */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadPoolManager {
    public static ThreadPoolManager manager;
    private static final int POOL_SIZE = 5;

    private final ExecutorService executorService;

    private ThreadPoolManager() {
        executorService = Executors.newFixedThreadPool(POOL_SIZE);
    }

    public synchronized static ThreadPoolManager getInstance() {
        if (manager == null) {
            return new ThreadPoolManager();
        }
        return manager;
    }

    public void executeTask(Runnable task) throws InterruptedException {
        executorService.execute(task);
        Thread.sleep(1000);
    }

    public void shutdown() {
        executorService.shutdown();
    }
}

public class SingletonPatternImplementation {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolManager.getInstance().executeTask(() -> {
            System.out.println("Task 1 is assign !" + " " + Thread.currentThread().getName());
        });

        ThreadPoolManager.getInstance().executeTask(() -> {
            System.out.println("Task 2 is assign !" + " " + Thread.currentThread().getName());
        });

        ThreadPoolManager.getInstance().shutdown();
    }
}
