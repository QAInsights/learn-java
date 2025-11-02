package org.hackerrank.formatter;

import java.util.Arrays;
import java.util.Scanner;

public class AlgebraDriver {

    public static void main(String[] args) {

        Scanner q = new Scanner(System.in);
        int queries = q.nextInt();


        if (queries >= 1 && queries <= 500) {

            for (int i = 0; i < queries; i++) {
                Scanner abInput = new Scanner(System.in);
                String ab = abInput.nextLine();

                System.out.println("You entered " + ab);

                String[] splitAb = ab.split(" ");

                System.out.println("Total numbers are " + splitAb.length);

                int a = Integer.parseInt(splitAb[0]);
                int b = Integer.parseInt(splitAb[1]);
                int n = Integer.parseInt(splitAb[2]);

                if (a >= 0 && a <= 50 && b >= 0 && b <= 50 && n >= 1 && n <= 15) {
                    System.out.println(calculateSeries(a, b, n));
                }
            }
        }
    }

    private static String calculateSeries(int a, int b, int n) {
        StringBuilder output = new StringBuilder();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            a += ((int) Math.pow(2, i) * b);
            output.append(a).append(" ");
        }
        System.out.println("Answer is " + output);
        return output.toString();
    }

}
