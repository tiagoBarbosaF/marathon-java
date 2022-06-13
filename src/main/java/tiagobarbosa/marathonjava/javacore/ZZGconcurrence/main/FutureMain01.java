package tiagobarbosa.marathonjava.javacore.ZZGconcurrence.main;

import java.util.concurrent.*;

public class FutureMain01 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarRequest = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(10);
            return 4.90D;
        });
        System.out.println(doSomething());
        try {
            Double dollarResponse = dollarRequest.get(3, TimeUnit.SECONDS);
            System.out.printf("Dollar: %s%n", dollarResponse);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }

    private static long doSomething() {
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += 1;
        }
        return sum;
    }
}
