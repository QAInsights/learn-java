package org.hackerrank.twosum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = { 3, 2, 4 };
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSum(int[] nums, int target) {
        int sum = 0;

        HashMap<Integer, Integer> arr = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            sum += nums[i];

            if (arr.containsKey(complement)) {
                return new int[] { arr.get(complement), i };
            }
            arr.put(nums[i], i);
        }

        return new int[] { -1, -1 };

    }

}
