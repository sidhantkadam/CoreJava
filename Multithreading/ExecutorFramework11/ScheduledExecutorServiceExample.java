package Multithreading.ExecutorFramework11;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

        service.scheduleAtFixedRate(() -> {
            System.out.println("RUN after every 5 seconds");
        }, 5, 5, TimeUnit.MILLISECONDS);

        service.scheduleWithFixedDelay(() -> {
            System.out.println("RUN after every 5 seconds");
        }, 5, 5, TimeUnit.MILLISECONDS);
    }
}
