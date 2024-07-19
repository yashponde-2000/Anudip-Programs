package labNo38;

import java.util.Scanner;
import java.util.concurrent.*;

class PrimeCalculator implements Callable<Long> {
    private final long start;
    private final long end;

    public PrimeCalculator(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() {
        long sum = 0;
        for (long number = start; number <= end; number++) {
            if (isPrime(number)) {
                sum += number;
            }
        }
        return sum;
    }

    private boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class SumOfPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit to calculate sum of prime numbers: ");
        long limit = scanner.nextLong();

        int numThreads = Runtime.getRuntime().availableProcessors(); // Use available processors as number of threads

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        long step = limit / numThreads;

        long start = 1;
        long end = step;

        long totalSum = 0;

        try {
            // Submit tasks to calculate prime sum for each segment
            for (int i = 0; i < numThreads; i++) {
                Future<Long> future = executor.submit(new PrimeCalculator(start, end));
                totalSum += future.get();
                start = end + 1;
                end = (i == numThreads - 2) ? limit : end + step;
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
            scanner.close();
        }

        System.out.println("Sum of prime numbers up to " + limit + " is: " + totalSum);
    }
}
