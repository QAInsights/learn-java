package org.qainsights.search;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {5, 7, 13, 18, 26, 33};

        int find = 11;

        int res = doBinarySearch(arr, find);
        if (res == -1)
            System.out.println("Not Found");
        else System.out.println(find + " found at position " + (res + 1));
    }

    private static int doBinarySearch(int[] arr, int find) {

        int pos = -1;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == find) {
                return mid;
            } else if (find < arr[mid]) {
                right = mid - 1;
            } else
                left = mid + 1;
        }

        return pos;
    }
}
