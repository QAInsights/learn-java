package org.qainsights.chapter4;

public class Q8 {
    public static void main(String[] args) {
        // Use an enhanced for loop to print alternate elements of an array.

        int[] nums = {11, 2, 3, 4, 5};
//        int i = 0;
//        for (int ignored : nums) {
//            if (i <= nums.length - 1)
//                System.out.println(nums[i]);
//            i += 2;
//        }

        int idx = 0;
        for (int j : nums) {
            if (idx % 2 == 0)
                System.out.println(j);
            idx++;
        }

        System.out.println("Reversed");
        // Can you use an enhanced for loop to print the elements in reverse order?
//        int l = nums.length;
//        for (int ignored : nums) {
//
//            if (l == 0)
//                break;
//            System.out.println(nums[l - 1]);
//            l--;
//        }

        int x = 0;
        int l = nums.length;

        for (int i : nums) {

            System.out.println(i);
        }


    }
}
