package org.practice1;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {1, 23, 4, 45, 23};
        double avg = 0;
        System.out.println("Before" + Arrays.toString(arr));
        avg = calcAvg(arr);
        System.out.println("Average " + avg);
        System.out.println("After " + Arrays.toString(arr));

        System.out.println("Doubling it - passing an array");
        System.out.println("Original Array " + Arrays.toString(arr));

        int[] doubleEachElement = doubleIt(arr);
        System.out.println("Doubling it now " + Arrays.toString(doubleEachElement));
        System.out.println("Original Array After " + Arrays.toString(arr));

        // Pass by reference
        int[] newDouble = new int[]{1, 2, 3, 4, 5};
        System.out.println("New Double " + Arrays.toString(newDouble));

        for (int i = 0; i < newDouble.length; ++i) {
            doubleItIndividualValue(newDouble[i]);
        }
        System.out.println("Original New Double " + Arrays.toString(newDouble));

        // Pass by value does not affect original array

    }

    private static void doubleItIndividualValue(int n) {
        System.out.println("Modifying element " + n * 2);
    }

    private static int[] doubleIt(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = 2 * arr[i];
        }
        return arr;
    }

    private static double calcAvg(int[] arr) {

        int sum = 0;
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; ++i) {
                sum += arr[i];
            }
            return (double) sum / arr.length;
        }
        return 0;
    }
}
