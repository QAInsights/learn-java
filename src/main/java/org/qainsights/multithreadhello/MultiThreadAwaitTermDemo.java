package org.qainsights.multithreadhello;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadAwaitTermDemo {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.execute(() -> {
            try {
                callShort();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        ex.execute(() -> {
            try {
                callLong();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        ex.shutdown();
        ex.awaitTermination(10, TimeUnit.SECONDS); // Use only after shutdown

        List<Runnable> pending = ex.shutdownNow();
        System.out.println("Pending tasks: " + pending.size());

    }

    private static void callLong() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);

        System.out.println("5 seconds done." + Thread.currentThread().getName());

    }

    private static void callShort() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        System.out.println("5 seconds done." + Thread.currentThread().getName());
    }
}
