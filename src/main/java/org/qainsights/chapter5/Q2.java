package org.qainsights.chapter5;

import javax.swing.*;

public class Q2 {
    private String[] args = new String[0];

    public static void main(String[] args) {

        args = new String[args.length];
        for (String a : args) {
            System.out.println(a);
        }
        String arg = args[0];
        System.out.println(arg);
    }

    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }
}
