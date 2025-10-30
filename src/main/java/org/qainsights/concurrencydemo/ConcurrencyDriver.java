package org.qainsights.concurrencydemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ConcurrencyDriver {

    public static void main(String[] args) throws InterruptedException {

//        BankAccount a = new BankAccount("NKN");
//        a.spend(11);
//        System.out.println("Total amount available in " + a.toString() + " " + a.getBalance());
//
//        BankAccount b = new BankAccount("Preethi");
//        b.spend(1500);
//        System.out.println("Total amount available in " + b.toString() + " " + b.getBalance());

//        ExecutorService ex = Executors.newFixedThreadPool(2);
//        ex.execute(() -> a.spend(99));
//        ex.execute(() -> a.spend(50));
        //ex.shutdown();

        ExecutorService bb = Executors.newFixedThreadPool(6);
        Balance balance = new Balance();


        for (int i = 0; i < 10000; i++) {
            bb.execute(balance::increment);
//            System.out.println(Thread.currentThread().getName() + "-" + i + "-" + balance.balance.get());
        }

        bb.shutdown();
        if (bb.awaitTermination(1, TimeUnit.MINUTES)) System.out.println(balance.balance.get());


        /*
        main-992-990
        main-993-992
        main-994-992
        main-995-994
        main-996-994
        main-997-994
        main-998-995
        main-999-998
         */
    }
}
