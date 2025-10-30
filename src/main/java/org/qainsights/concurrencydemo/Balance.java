package org.qainsights.concurrencydemo;

import java.util.concurrent.atomic.AtomicInteger;

public class Balance {


//    int balance = 0;
//    public synchronized void increment() {
//        balance++;
//    }

    AtomicInteger balance = new AtomicInteger(0);

    public void increment() {
        balance.getAndIncrement();
    }
}
