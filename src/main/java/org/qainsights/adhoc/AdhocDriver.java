package org.qainsights.adhoc;

public class AdhocDriver {

    final int MAX_LENGTH = 5;

    public static void main(String[] args) {
        AdhocDriver ad = new AdhocDriver();
        ad.go();
        ad.goToString();
    }

    private void go() {
        int[] num = new int[MAX_LENGTH];

        for (int i = 0; i < MAX_LENGTH; i++) {
            System.out.println("Index is " + i + " and its value is " + ++num[i]);
        }

    }

    private void goToString() {
        String[] fruits = new String[1];
        fruits[0] = "Apple";

        System.out.println(fruits[fruits.length - 1]);

        String[] veggies = {"Tomato", "Beans", "Carrot"};

        for (String string : veggies) {
            System.out.println("Veggies are " + string);
        }

    }

}


