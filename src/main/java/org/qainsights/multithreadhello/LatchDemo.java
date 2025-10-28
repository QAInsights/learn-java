package org.qainsights.multithreadhello;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class LatchDemo {

    public static void main(String[] args) throws InterruptedException {
        // ExecutorService ex = Executors.newFixedThreadPool(2);
        // CountDownLatch countDownLatch = new CountDownLatch(2);

        // ex.execute(() -> waitForLatchAndThenPrint("Hello", countDownLatch));
        // ex.execute(() -> waitForLatchAndThenPrint("Hello again", countDownLatch));
        // System.out.println("Main program");
        // countDownLatch.countDown();
        // countDownLatch.countDown();

        // ex.shutdown();

        CountDownLatch latch = new CountDownLatch(10);

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    latch.await(); // all 5 threads wait here
                    System.out.println(Thread.currentThread().getName() + " started");
                } catch (InterruptedException e) {
                }
            }).start();
        }

        // After setup
        System.out.println("Releasing latch...");
        for (int i = 0; i < 10; i++) {
            latch.countDown(); // all 5 threads start together
            TimeUnit.SECONDS.sleep(1);

        }

    }

    private static void waitForLatchAndThenPrint(String msg, CountDownLatch countDownLatch) {

        try {
            countDownLatch.await();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out
                .println(msg + "=" + Thread.currentThread().getName() + ":Latch Count: " + countDownLatch.getCount());

    }
}
