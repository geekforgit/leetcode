package com.leetcode.practice;
/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

  Notice that the solution set must not contain duplicate triplets.*/

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] x = new int[]{0,0,0};
        System.out.println("Data is: " + threeSum(x));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Map<Integer, Integer> data = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int searchElement = nums[i] + nums[j]!=0?-(nums[i]+nums[j]):0;
                if (data.containsKey(searchElement)) {
                    List<Integer> sums = new ArrayList<>();
                    sums.add(nums[i]);
                    sums.add(nums[j]);
                    sums.add(searchElement);
                    Collections.sort(sums);
                    if (!result.contains(sums)) result.add(sums);
                }
            }
            data.put(nums[i], i);
        }
        return result;

    }
}
