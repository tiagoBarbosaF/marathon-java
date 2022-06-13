package tiagobarbosa.marathonjava.javacore.ZZGconcurrence.main;

import tiagobarbosa.marathonjava.javacore.ZZGconcurrence.service.StoreService;
import tiagobarbosa.marathonjava.javacore.ZZGconcurrence.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureMain03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeService = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeService) {
        long start = System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(10, r -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });

        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        List<CompletableFuture<Double>> completableFutures = stores.stream().map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s), executorService)).collect(Collectors.toList());
        List<Double> prices = completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList());


        System.out.println(prices);

        long end = System.currentTimeMillis();
        executorService.shutdown();
        System.out.printf("Time passed to searchPricesSync %d%n", (end - start));
    }
}
