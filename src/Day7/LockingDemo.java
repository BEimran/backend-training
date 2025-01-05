package Day7;

class SharedPrinter {
    public synchronized void printString(String message, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(Thread.currentThread().getName() + " - Printing: " + message);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted: " + e.getMessage());
            }
        }
    }

    public synchronized void countdown(int from) {
        for (int i = from; i >= 1; i--) {
            System.out.println(Thread.currentThread().getName() + " - Countdown: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted: " + e.getMessage());
            }
        }
    }

    public static synchronized void staticMethod(String message) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Static Method: " + message);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted: " + e.getMessage());
            }
        }
    }
}

public class LockingDemo {
    public static void main(String[] args) {
        SharedPrinter sharedPrinter = new SharedPrinter();
        Thread thread1 = new Thread(() -> {
            sharedPrinter.printString("Hello, World!", 5);
        }, "Thread 1");

        Thread thread2 = new Thread(() -> {
            sharedPrinter.countdown(5);
        }, "Thread 2");

        thread1.start();
        thread2.start();

        Thread thread3 = new Thread(() -> {
            SharedPrinter.staticMethod("Static Method Call 1");
        }, "Thread 3");

        Thread thread4 = new Thread(() -> {
            SharedPrinter.staticMethod("Static Method Call 2");
        }, "Thread 4");

        System.out.println("--- Class-Level Locking Demonstration ---");
        thread3.start();
        thread4.start();
    }
}

