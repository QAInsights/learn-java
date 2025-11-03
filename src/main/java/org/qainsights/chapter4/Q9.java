package org.qainsights.chapter4;

import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        // Given two arrays of same length and type,
        // copy the elements of the first array into
        // another in reverse order.

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};
        int l = a.length;

        int idx = l - 1;

        for (int i = 0; i < l; i++) {
            b[i] = a[idx];
            idx--;
        }

        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));


    }
}
