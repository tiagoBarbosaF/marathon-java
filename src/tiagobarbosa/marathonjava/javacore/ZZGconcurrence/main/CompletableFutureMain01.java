package tiagobarbosa.marathonjava.javacore.ZZGconcurrence.main;

import tiagobarbosa.marathonjava.javacore.ZZGconcurrence.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureMain01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
//        searchPricesSync(storeService);
//        searchPricesAsyncFuture(storeService);
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPricesSync(StoreService storeService) {
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store 01"));
        System.out.println(storeService.getPriceSync("Store 02"));
        System.out.println(storeService.getPriceSync("Store 03"));
        System.out.println(storeService.getPriceSync("Store 04"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d%n", (end - start));
    }

    private static void searchPricesAsyncFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        Future<Double> pricesAsyncFuture1 = storeService.getPricesAsyncFuture("Store 01");
        Future<Double> pricesAsyncFuture2 = storeService.getPricesAsyncFuture("Store 02");
        Future<Double> pricesAsyncFuture3 = storeService.getPricesAsyncFuture("Store 03");
        Future<Double> pricesAsyncFuture4 = storeService.getPricesAsyncFuture("Store 04");
        try {
            System.out.println(pricesAsyncFuture1.get());
            System.out.println(pricesAsyncFuture2.get());
            System.out.println(pricesAsyncFuture3.get());
            System.out.println(pricesAsyncFuture4.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d%n", (end - start));
        StoreService.shutdown();
    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        CompletableFuture<Double> pricesAsyncFuture1 = storeService.getPricesAsyncCompletableFuture("Store 01");
        CompletableFuture<Double> pricesAsyncFuture2 = storeService.getPricesAsyncCompletableFuture("Store 02");
        CompletableFuture<Double> pricesAsyncFuture3 = storeService.getPricesAsyncCompletableFuture("Store 03");
        CompletableFuture<Double> pricesAsyncFuture4 = storeService.getPricesAsyncCompletableFuture("Store 04");

        System.out.println(pricesAsyncFuture1.join());
        System.out.println(pricesAsyncFuture2.join());
        System.out.println(pricesAsyncFuture3.join());
        System.out.println(pricesAsyncFuture4.join());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %d%n", (end - start));
    }
}
