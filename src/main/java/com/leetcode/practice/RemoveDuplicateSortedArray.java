package com.leetcode.practice;

public class RemoveDuplicateSortedArray {
    //https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/

    public static void main(String[] args) {
        System.out.println("Output is: " + removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));

    }

    public static int removeDuplicates(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            else {
                pos++;
                nums[pos] = nums[i + 1];
            }
        }
        for (int n : nums) {
            System.out.print(" " + n + ",");
        }
        return pos + 1;
    }

}
