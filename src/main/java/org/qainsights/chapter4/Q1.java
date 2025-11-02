package org.qainsights.chapter4;

import java.util.Arrays;

public class Q1 {

    public static void main(String[] args) {

        /*
        Initialize a triangular matrix of ints using a for loop such the
        each element contains an value equal to the sum of its row and column index.

        Do the same using a while loop.

        */

        int[][][] nums = new int[][][]{
                {
                        {
                                0
                        },
                        {
                                0, 0
                        },
                        {
                                0, 0, 0
                        }
                }
        };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k = 0; k < nums[i][j].length; k++) {
                    nums[i][j][k] = j + k;
                    System.out.println(nums[i][j][k]);
                }
            }
        }

        System.out.println(Arrays.deepToString(nums));

        int[][] arr = new int[][]{
                {1},
                {1, 1},
                {1, 1, 1}
        };
        int outer = 0;
        while (outer < arr.length) {
            int inner = 0;
            while (inner < arr[outer].length) {

                arr[outer][inner] = outer + inner;
                inner++;
            }
            outer++;
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
