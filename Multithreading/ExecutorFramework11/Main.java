package Multithreading.ExecutorFramework11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 5; i++) {
            int finalI = i;
            executor.execute(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });
        }
        executor.shutdown();
    }

    public static long factorial(int n) {
        int result = 1;
        for (int j = 1; j <= n; j++) {
            result = result * j;
        }
        return result;
    }
}
