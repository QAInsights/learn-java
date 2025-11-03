package org.qainsights.chapter4;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
//        System.out.println("Enter the string: ");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//
////        Write a method that accepts a String as input and count the number of spaces
////        in the string from start to until it finds an 'x', or
////        if there is no 'x' in the string, till end.
//
//        int spaceCount = 0;
//        char space = ' ';
//        for (int i = 0; i < input.length(); i++) {
//            if (input.charAt(i) == 'x') break;
//            if (input.charAt(i) == space) spaceCount++;
//        }
//
//        System.out.println("Number of spaces till x (if present): " + spaceCount);
//        scanner.close();

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        isPrime(n);
        s.close();

    }

    private static void isPrime(int n) {

        if (n >= 2) {
            boolean isPrime = true;
            for (int i = 2; i <= n / 2; i++) {

                if (n % i == 0) {
                    isPrime = false;
                    break;
                }

            }
            System.out.println(isPrime);

        }
    }
}
