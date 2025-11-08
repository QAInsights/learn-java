package org.hackerrank.formatter;

import jdk.jfr.TransitionTo;

import javax.management.ConstructorParameters;
import java.util.Scanner;

public class ReadInputLines {

    public static void main(String[] args) throws Exception {
        /*
        Read some unknown  lines of input from stdin(System.in)
        until you reach EOF; each line of input contains a non-empty String.

         */

        Scanner scanner = new Scanner(System.in);
        String input = "";
        int lineNumber = 0;
        while (scanner.hasNextLine()) {
            input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }
            lineNumber++;
            System.out.println(lineNumber + " " + input);
        }
        scanner.close();
        ReadInputLines.printer();
    }

    private static void printer() throws Exception {

        System.out.println();
        int i = 1,
                j = 0b101;
        System.out.println(i + j);

        String name = null;
        try {
//            System.out.println(name.length());
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace().toString());
            throw new RuntimeException(e.getCause());
        }
    }
}
