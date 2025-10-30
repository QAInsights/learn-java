package org.qainsights.concurrencydemo;

import javax.sound.midi.Soundbank;

public class AccountJob {

    private int balance;
    private String name;
    private int amountToSpend;

    public AccountJob(String name, int balance, int amountToSpend) {
        this.name = name;
        this.balance = balance;
        this.amountToSpend = amountToSpend;
    }

    public int getBalance() {
        if (balance <= 0)
            return -1;
        return balance - amountToSpend;
    }

    public void goShopping(int amountToSpend) {
        if (amountToSpend >= balance) {
            System.out.println("Overdrawn");

        } else {
            System.out.println("Shopping it for " + amountToSpend);
        }
    }


}
