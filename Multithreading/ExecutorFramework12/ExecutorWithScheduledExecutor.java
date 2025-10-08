package Multithreading.ExecutorFramework12;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

    /*
        Executes tasks after a delay or periodically.

        scheduleAtFixedRate():
        Executes the task at a fixed rate — i.e., it tries to maintain a constant period
        between task start times.

        scheduleWithFixedDelay():
        Executes the task with a fixed delay between the end of the previous execution and the
        start of the next.
    */

public class ExecutorWithScheduledExecutor {

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
            System.out.println("Running task at fixed rate." + LocalTime.now());
        };

        // Schedule the task to run every 1 second
        scheduler.scheduleAtFixedRate(task, 0, 5, TimeUnit.SECONDS);

        // Keep the main thread alive for a while to see output
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        Runnable task2 = () -> {
            System.out.println("Running task with fixed delay." + LocalTime.now());
        };

        // Schedule the task with a fixed delay of 1 second
        scheduler.scheduleWithFixedDelay(task2, 0, 1, TimeUnit.SECONDS);

        // Keep the main thread alive for a while to see output
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        scheduler.shutdown();
    }
}
