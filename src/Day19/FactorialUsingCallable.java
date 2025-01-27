package Day19;

import java.util.concurrent.*;

class FactorialTask implements Callable<Long> {
    private final int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}

public class FactorialUsingCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int number = 5;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Long> future = executorService.submit(new FactorialTask(number));
        Long result = future.get();
        System.out.println("Factorial of " + number + " is: " + result);
        executorService.shutdown();
    }
}
