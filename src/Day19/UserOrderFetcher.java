package Day19;

import java.util.concurrent.*;

public class UserOrderFetcher {
    public static void main(String[] args) {
        CompletableFuture<String> userDataFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "User: John Doe, Age: 30";
        });

        CompletableFuture<String> userOrdersFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Orders: [Product1, Product2, Product3]";
        });

        CompletableFuture<Void> combinedFuture = userDataFuture
                .thenCombine(userOrdersFuture, (userData, userOrders) -> {
                    return userData + ", " + userOrders;
                })
                .thenAccept(result -> {
                    System.out.println(result);
                });

        combinedFuture.join();
    }
}
