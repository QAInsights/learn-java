package org.qainsights.chapter3;

import java.util.Arrays;

public class DataTest {
    public static void main(String[] args) {
        /*
        Define a simple class named Data with a public instance field named value of type int.
        Create and initialize a Data variable named d in TestClass's main.
        Create an array of Data of length 3 and initialize each of its elements with the same Data instance.
        Use any of the array elements to update the value field of the Data object.
        Print out the value field of the Data object using the three elements of the array.
        Finally, print the value field of the original Data using the variable d.
        */

        Data d = new Data(11);

        Data[] arr = new Data[3];

        Arrays.fill(arr, d);
        arr[1].value = 11;
        for (Data dd : arr) {
            System.out.println(dd.value);
        }

        System.out.println(d.value);

    }
}

class Data {
    public int value;

    public Data(int value) {
        this.value = value;
    }
}
