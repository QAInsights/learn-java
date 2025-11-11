package org.practice1;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] twoDInts = new int[5][5];
        int[] oneInt = {1, 1, 1, 1};
        int[][] twoDEnv = {
                {
                        1, 2
                },
                {
                        3, 4
                },
                {
                        5
                }
        };


        for (int[] ints : twoDEnv) {
            for (int anInt : ints) {
                System.out.printf("%d \t", anInt);
            }
            System.out.println();
        }
        System.out.println("*".repeat(5));
        
        for (int i = 0; i < twoDEnv.length; ++i) {
            for (int j = 0; j < twoDEnv[i].length; ++j) {
                System.out.printf("%d \t", twoDEnv[i][j]);
            }
            System.out.println();
        }

    }
}
