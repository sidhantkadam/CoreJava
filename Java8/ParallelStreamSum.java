package Java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class ParallelStreamSum {
    public static long calculateParallelSum(List<Long> numbers) {
        return numbers.parallelStream().mapToLong(Long::longValue).sum();
    }

    public static void main(String[] args) {
        List<Long> numbers = LongStream.rangeClosed(1, 1_000_000).boxed().toList();

        long parallelSum = calculateParallelSum(numbers);
        System.out.println("Using Parallel : " + parallelSum);

        long sequentialSum = numbers.stream().mapToLong(Long::longValue).sum();
        System.out.println("Using Sequential : " + sequentialSum);
    }
}
