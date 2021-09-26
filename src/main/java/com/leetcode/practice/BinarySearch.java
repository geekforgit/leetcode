package com.leetcode.practice;


public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Binary Search");
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));

    }

    public static int search(int[] nums, int target) {
        return performBinarySearch(nums, 0, nums.length - 1, target);
    }

    private static int performBinarySearch(int[] nums, int start, int end, int target) {
        int mid = (start + end) / 2;
        if (start < end) {
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                return performBinarySearch(nums, start, mid - 1, target);
            else
                return performBinarySearch(nums, mid + 1, end, target);
        } else return -1;
    }
}
