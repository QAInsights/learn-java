package org.qainsights.multithreadhello;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadHello {

    static final int FIXED_THREAD_POOL = 12;

    public static void main(String[] args) throws InterruptedException {
        // Thread needs a job - so make it runnable

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(() -> System.out.println("Hello"));
        System.out.println("Main ... ");
        // Thread.dumpStack();
        executorService.shutdown();

        Thread t = new Thread(() -> System.out.println("New thread"));
        t.start();
        System.out.println("Thread demo");
        // Thread.dumpStack();

        ExecutorService ex = Executors.newFixedThreadPool(FIXED_THREAD_POOL);
        ex.submit(() -> System.out.println("Fixed Thread Pool with " + FIXED_THREAD_POOL));
        System.out.println(Thread.activeCount());

        ExecutorService ex1 = Executors.newFixedThreadPool(FIXED_THREAD_POOL);

        for (int i = 0; i < FIXED_THREAD_POOL; i++) {
            int taskId = i;
            ex1.submit(() -> {
                Thread.currentThread().setName("ThreadName is " + taskId);
                System.out.println("Task " + taskId + " running in " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {
                }
            });
        }

        System.out.println("Active threads: " + Thread.activeCount());
        ex1.shutdown();
        ex.shutdown();

        ExecutorService vExecutorService = Executors.newVirtualThreadPerTaskExecutor();
        vExecutorService.submit(() -> System.out.println("Virtual Thread"));
        System.out.println("Virtual Threads Main");
        try {
            Thread.sleep(1000);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // More readable than Thread.sleep(); :)
        vExecutorService.shutdown();

    }

}
