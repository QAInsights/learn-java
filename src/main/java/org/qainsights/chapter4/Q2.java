package org.qainsights.chapter4;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        /*
        Write a method that determines whether a given number N is a prime number or not by dividing that number
        with all the numbers from 2 to N/2 and checking the remainder.
         */
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean isPrime;
        if (x == 1) {
            isPrime = false;
        } else if (x <= 0) {
            System.out.println("Invalid number");
            return;
        } else {
            isPrime = isPrimeOrNot(x);
        }

//        if (isPrime) System.out.println("The number " + x + " is: PRIME");
//        else System.out.println("The number " + x + " is NOT PRIME");


        nestedPrime(x);


    }

    private static void nestedPrime(int x) {
        for (int i = 2; i <= x; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
//                    System.out.println(i + " not prime");
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(i + " ");


        }
    }

    private static boolean isPrimeOrNot(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
    Use nested for loops to print a list of prime numbers from 2 to N.
     */


}
