package org.qainsights.concurrencydemo;

import javax.swing.*;

public class BankAccount {

    private int balance = 100;
    private String name;

    public BankAccount(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    // synchronized puts a lock on the OBJECT - not in a method
    public /*synchronized*/ void spend(int amountToSpend) {
        synchronized (this) {

            if (amountToSpend >= balance) {
                System.out.println("Hey! " + this.name + " " + Thread.currentThread().getName() + " No amount in your bank. Overdrawn");
            } else {
                System.out.println("Hey! " + this.name + " " + Thread.currentThread().getName() + "-Your balance is " + getBalance());
                System.out.println("Shopping done for " + " " + Thread.currentThread().getName() + "-" + amountToSpend);
                balance = getBalance() - amountToSpend;
                System.out.println(Thread.currentThread().getName() + "-" + " After spending the balance is " + balance);
            }
        }
    }

    public String toString() {
        return this.name;
    }

}
