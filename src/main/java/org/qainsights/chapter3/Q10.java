package org.qainsights.chapter3;

import java.util.Arrays;

public class Q10 {

    public static void main(String[] args) {
        /*
        Declare and initialize a variable of type array of Objects of length 3.
        Initialize the first element of this array with an array of ints,
                    second with an array of array of ints, and
                    third with an array of Objects.
        See if any of the assignments fails compilation.
         */

        Object[] o = new Object[3];

        o[0] = new int[]{1, 1, 1};
        o[1] = new int[][]{
                {
                        1, 1, 1
                }
        };
        o[2] = new Object[]{
                new Object(), new Object()
        };

//        int[][] nums = new int[1][3];
//
//        // { {1,2,3}}
//
//        for (int k = 0; k < nums.length; k++) {
//            for (int l = 0; l < nums[0].length; l++) {
//                nums[k][l] = 1;
//                System.out.println(nums[k][l]);
//            }
//            System.out.println(nums.length);
//        }

//        int[][][] nums = new int[1][4][2];

//        {
//            { 1, 2},
//            { 1, 2},
//            { 1, 2},
//            { 1, 2}
//        }
//0 0 0   2
//0 0 1   2
//0 0 0   2
//0 0 1
//0 1 0
//0 1 1
//0 2 0
//0 2 1
//0 3 0
//0 3 1
//
//            0 1 1 2 2 3 3 4


        int[][][] nums = new int[1][4][2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k = 0; k < nums[i][j].length; k++) {
                    nums[i][j][k] = i + j + k;
                    System.out.println("num[" + i + "][" + j + "][" + k + "] = " + nums[i][j][k]);
                }
            }
        }


    }
}
