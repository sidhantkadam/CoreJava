package Java8.StreamAPI.ParallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SequentialVsParallelStream {

    public static long customizedSupplier(Supplier<Integer> supplier, int noOfTimes) {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < noOfTimes; i++) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static int sequentialType() {
        return IntStream.rangeClosed(1, 1000000)
                .sum();
    }

    public static int parallelType() {
        return IntStream.rangeClosed(1, 1000000)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        long s = customizedSupplier(SequentialVsParallelStream::sequentialType, 20);
        System.out.println("Sequential Duration in MilliSeconds: " + s);

        long p = customizedSupplier(SequentialVsParallelStream::parallelType, 20);
        System.out.println("Parallel Duration in MilliSeconds: " + p);
    }
}
