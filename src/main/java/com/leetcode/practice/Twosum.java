package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

/*Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

You can return the answer in any order.*/
public class Twosum {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 3};
        int target = 6;
        System.out.println("Result is : " + twoSum(nums, target));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> data = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int lookup = target - nums[i];

            if (data.containsKey(lookup)) {
                return new int[]{data.get(lookup), i};


            }
            data.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum found");
    }
}
