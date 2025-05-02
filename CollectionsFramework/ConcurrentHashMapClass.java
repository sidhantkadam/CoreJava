package CollectionsFramework;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentHashMapClass {
    private static final int THREAD_POOL = 5;
    private static final int THREAD_INSERTION = 100;

    private static ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL);

        for (int i = 0; i < THREAD_INSERTION; i++) {
            executorService.execute(insertRecord());
        }

        executorService.shutdown();

        if (!executorService.isTerminated()) {
            Thread.sleep(1000);
        }

        System.out.println(map.size());
    }

    private static Runnable insertRecord() {
        return () -> {
            for (int i = 0; i < THREAD_INSERTION; i++) {
                map.put(i + Thread.currentThread().getName(), i);
            }
        };
    }
}
