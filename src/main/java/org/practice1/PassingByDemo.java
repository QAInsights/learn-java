package org.practice1;

import java.util.Arrays;

public class PassingByDemo {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("X " + x);
        modifyX(x);
        System.out.println("X " + x);
        System.out.println(modifyXWithReturn(x));
        x = modifyXWithReturn(x);
        System.out.println(x);

        int[] arr1 = {1, 2, 3};
        System.out.println("Before arr1 in main " + Arrays.toString(arr1));
        modifyArr1(arr1);
        System.out.println("After arr1 in main " + Arrays.toString(arr1));

        int[] arr2 = {7, 8, 9};
        System.out.println("Before arr1 in main " + Arrays.toString(arr2));
        int newArr2Element = modifyArr2Element(arr2[0]);
        System.out.println(newArr2Element);
        System.out.println("After arr1 in main " + Arrays.toString(arr2));
        System.out.println(newArr2Element);


    }

    private static int modifyXWithReturn(int x) {
        return 3 * x;
    }

    private static int modifyArr2Element(int n) {
        System.out.println("Arr2 0th element is " + (n * 2));
        return n * 2;
    }

    private static void modifyX(int x) {
        x = 2 * x;
        System.out.println(x);
    }

    private static void modifyArr1(int[] arr1) {
        for (int i = 0; i < arr1.length; ++i) {
            arr1[i] = 2 * arr1[i];
        }
        System.out.println("Arr1 in modifyArr1 " + Arrays.toString(arr1));
    }
}
