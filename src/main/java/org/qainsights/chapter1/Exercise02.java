package org.qainsights.chapter1;

public class Exercise02 {

    public static void main(String[] args) {
        int i = 0;
        int j = 1;

        while(j <= 1) {
            i = 1;
            j++;
            // int i = 10; // cannot define again
        }

        System.out.println(i); // 1
    }

}
