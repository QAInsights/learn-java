package org.qainsights.multithreadhello;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PredicatableSleep {
    public static void main(String[] args) {
        PredicatableSleep ps = new PredicatableSleep();
        ps.go();
        System.out.println("Main Call");
        System.out.println(Thread.currentThread().getState());

    }

    private void go() {
        ExecutorService ex = Executors.newSingleThreadExecutor();

        ex.submit(() -> justSleepAndPrint());
        System.out.println("Back to go method");

        ex.shutdown();
    }

    private void justSleepAndPrint() {
        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Sleep is done.");
            System.out.println(Thread.currentThread().getState());

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Just Print");
        System.out.println(Thread.currentThread().getName());

    }
}
