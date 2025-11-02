package org.qainsights.chapter3;

public class TriangularMatrix {
    public static void main(String[] args) {
        /*
        Define and initialize an array of array of ints that resembles a triangular matrix of integers.
        */


        int[][][] triangle = {
                {
                        {
                                1
                        },
                        {
                                2, 2
                        },
                        {
                                3, 3, 3
                        }
                }
        };

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                for (int k = 0; k < triangle[i][j].length; k++) {
                    System.out.println(triangle[i][j][k]);
                }
            }
        }

        int[][][] invertedTriangle = {
                {
                        {
                                3, 3, 3
                        },
                        {
                                2, 2
                        },
                        {
                                1
                        }
                }
        };

        for (int i = 0; i < invertedTriangle.length; i++) {
            for (int j = 0; j < invertedTriangle[i].length; j++) {
                for (int k = 0; k < invertedTriangle[i][j].length; k++) {
                    System.out.println(invertedTriangle[i][j][k]);
                }
            }
        }
    }
}
