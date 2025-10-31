package org.qainsights.chapter3;

import java.util.Arrays;

public class Chapter3Driver {

    public static void main(String[] args) {
        /*
        Create a array of booleans of length 3 inside the main method.
        Print the elements of the array without initializing the array elements explicitly.
        Observe the output.
        */
        int[] a = {1, 2, 3}; // int aa[] = new int[3];
        System.out.println(a); // [I@723279cf

        /*
        Given int[] first = new int[3];, int[] second = {};, and int[] third = null;,
        print out the length of the three arrays and print out every element of the three arrays.
         */

        int[] first = new int[3];
        int[] second = {};
        int[] third = null;

        System.out.println(first.length); // 3
        System.out.println(second.length); // 0
//        System.out.println(third.length); // exception

        System.out.println("First");
        for (int i = 0; i < first.length; i++) {
            System.out.println(first[i]);
        }
        System.out.println("Second");
        System.out.println(second); //[I@10f87f48

        for (int i : second) {
            System.out.println(second[i]);
        }
//        System.out.println("Third");
//        for (int i : third) {
//            System.out.println(third[i]);
//        }

        /*
        Create an array of chars containing four values.
        Write assignment statements involving the array such that
        the first element of the array will contain the value of the second element,
        second element will have the value that was there in the third element. and
        third element will contain the value of the fourth element.
        */

        print("Q3");
        char[] c = {'n', 'p', 'd', 'j'};


        for (int i = 0; i < c.length - 1; i++) {
            c[i] = c[i + 1];
            System.out.println(c[i]);
        }

        print("Q4");

        /*
        Declare and initialize an array of length 4 of type array of Strings without using the new keyword such that no two arrays
        arrays of Strings have the same length.
        Print the length of all of the arrays one by one (including the length of the two dimensional array).
         */
        String[][] s = {
                {"Hello", "there", "again", "!!!!!"},
                {"Third", "Four", "Fifth"},
                {"7"},
                {"11", "11"}
        };

        for (String[] outer : s) {
            for (String inner : outer) {
                System.out.println("\t" + inner);
            }
            System.out.println("The length is " + outer.length);
        }

        for (String[] arr : s) {
            System.out.println(Arrays.deepToString(arr));
        }

        print("Q5");
        /*
        Given the statement String[][] names = new String[2][3];
        How many Strings will you need to fill up names completely?
        Initialize each element of names with a non-null String.
        Print each of those values one by one without using a loop.
        Do the same using nested for loops after going through the chapter on loops.
         */

        String[][] names = new String[2][3];
        // How many Strings will you need to fill up names completely?
        // 6

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                names[i][j] = "King";
                System.out.println(names[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(names));

        print("Q6");
        /*
        Define two variables of type array of Strings. Initialize them using the elements of the array created in the previous exercise.

        */

        String[][] s1 = names;
        String[][] s2 = names;


    }

    public static void print(Object msg) {
        System.out.println(msg);
    }
}
