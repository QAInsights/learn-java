package org.hackerrank.regexdemo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDriver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        Pattern p1 = Pattern.compile("<([^<>]+)>([^<>]+)</\\1>");

        while (testCases > 0 && in.hasNextLine()) {
            String line = in.nextLine();
            Matcher m1 = p1.matcher(line);
            boolean found = false;

            while (m1.find()) {
                System.out.println(m1.group(2));
                found = true;
            }
            if (!found) {
                System.out.println("None");
            }
            testCases--;
        }
        in.close();

    }
}
