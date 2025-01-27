package Day19;

import java.util.concurrent.*;

public class SimpleExecutorExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 10; i++) {
            final int number = i;
            executorService.submit(() -> {
                System.out.println("Task " + number + " is running on thread " + Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
    }
}

