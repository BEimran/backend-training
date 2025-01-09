package Day11;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class OnlineVotingSystem {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentMap<String, AtomicInteger> votes = new ConcurrentHashMap<>();

        Runnable voter1 = () -> castVote(votes, "Alice");
        Runnable voter2 = () -> castVote(votes, "Bob");
        Runnable voter3 = () -> castVote(votes, "Alice");
        Runnable voter4 = () -> castVote(votes, "Charlie");
        Thread thread1 = new Thread(voter1);
        Thread thread2 = new Thread(voter2);
        Thread thread3 = new Thread(voter3);
        Thread thread4 = new Thread(voter4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println("Final Vote Counts:");
        votes.forEach((candidate, count) -> System.out.println(candidate + ": " + count));
    }

    public static void castVote(ConcurrentMap<String, AtomicInteger> votes, String candidate) {
        votes.computeIfAbsent(candidate, k -> new AtomicInteger(0)).incrementAndGet();
    }
}

