package org.hackerrank.formatter;

import java.util.Scanner;

public class FormatDriver {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            int x = sc.nextInt();

            // %-15s → left-align string in 15 spaces
            // %03d   → integer, 3 digits, leading zeros
            System.out.printf("%-15s%03d%n", s, x);
        }

        sc.close();

    }
}
