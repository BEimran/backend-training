package Day19;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SimpleForkJoinExample {

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        SumTask task = new SumTask(1, 1000000);
        long result = pool.invoke(task);
        System.out.println(result);
    }

    static class SumTask extends RecursiveTask<Long> {
        private long start, end;

        public SumTask(long start, long end) {
            this.start = start;
            this.end = end;
        }

        @Override
        protected Long compute() {
            if (end - start <= 10000) {
                long sum = 0;
                for (long i = start; i <= end; i++) {
                    sum += i;
                }
                return sum;
            } else {
                long mid = (start + end) / 2;
                SumTask task1 = new SumTask(start, mid);
                SumTask task2 = new SumTask(mid + 1, end);
                task1.fork();
                long result2 = task2.fork().join();
                long result1 = task1.join();
                return result1 + result2;
            }
        }
    }
}

