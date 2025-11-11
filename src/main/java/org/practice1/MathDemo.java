package org.practice1;

import java.beans.BeanInfo;
import java.math.BigInteger;
import java.util.Arrays;

public class MathDemo {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        // 5 6 3 9 1 4

        for (int i : arr) {
            System.out.println(i);
        }
        int min = arr[0];
        int max = arr[0];
        for (int j : arr) {
            min = Math.min(min, j);
            max = Math.max(max, j);
        }
        System.out.println("Minimum " + min);
        System.out.println("Maximum " + max);

        long ll = 1221L;
        double dd = 12121.232;
        float ff = 121.22f;
        System.out.println(Math.ceil(dd));
        System.out.println(Math.floor(dd));
        System.out.println(Math.round(dd));

        var bb = BigInteger.valueOf(1111111)
                .divide(BigInteger.valueOf(111))
                .multiply(BigInteger.TEN)
                .add(BigInteger.ZERO);
        System.out.println(bb);

    }
}
