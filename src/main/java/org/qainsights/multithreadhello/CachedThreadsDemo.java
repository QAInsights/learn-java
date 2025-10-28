package org.qainsights.multithreadhello;

import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class CachedThreadsDemo {

    public static void main(String[] args) throws InterruptedException {

        // AtomicInteger counter = new AtomicInteger(1);

        // ExecutorService ex = Executors.newCachedThreadPool((Runnable r) -> {
        // Thread t = new Thread(r);
        // t.setDaemon(false);
        // t.setName("New Name" + counter.getAndIncrement());
        // return t;
        // });

        CustomThreadFactory ct = new CustomThreadFactory("MyPrefix");
        ExecutorService ex = Executors.newCachedThreadPool(ct);

        for (int i = 0; i < 5; i++)
            ex.execute(() -> System.out.println("Hello-" + Thread.currentThread().getName()
                    + "-" + Thread.currentThread().getState()));

        ex.shutdown();

    }

    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(false);
        t.setName(UUID.randomUUID().toString());
        return t;
    }

}
