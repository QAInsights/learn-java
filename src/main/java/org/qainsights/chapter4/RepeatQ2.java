package org.qainsights.chapter4;

import java.util.Scanner;

public class RepeatQ2 {

    public static void main(String[] args) {

        int x = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to print only the PRIME number series:");
        x = scanner.nextInt();


        System.out.println(primeOrNot(x));
//        printPrimeSeries(x);
        scanner.close();

    }

    private static boolean primeOrNot(int x) {
        if (x >= 2) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }
        return false;
    }

    private static void printPrimeSeries(int x) {

        if (x >= 2) {
            // Find prime series
            for (int i = 2; i <= x; i++) {
                boolean isPrime = true;

                for (int j = 2; j <= i - 1; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) System.out.print(i + " ");

            }

        }

    }

}
