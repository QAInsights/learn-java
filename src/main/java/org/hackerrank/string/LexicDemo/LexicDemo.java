package org.hackerrank.string.LexicDemo;

public class LexicDemo {
    public static void main(String[] args) {
        String A = "hello";
        String B = "java";

        System.out.println(A.length() + B.length());

        /*
        Returns:
        the value 0 if the argument string is equal to this string;
        a value less than 0 if this string is lexicographically less than the string argument;
        and a value greater than 0 if this string is lexicographically greater than the string argument.
         */
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else if (A.compareTo(B) < 0) {
            System.out.println("No");
        } else System.out.println("Both are equal");

        char a = Character.toUpperCase(A.charAt(0));
        char b = Character.toUpperCase(B.charAt(0));

        String newA = a + A.substring(1);
        String newB = b + B.substring(1);
        System.out.println(newA + " " + newB);

    }
}
