package com.leetcode.practice;

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        if (target > nums[end]) {
            return end + 1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) return mid;
            else if (target > nums[mid]) start = mid + 1;
            else end = mid - 1;
        }

        return start;
    }
//through recursion
public static int searchInsert2(int[] nums, int target) {
    if(target>nums[nums.length - 1]) return nums.length;

    return performBinarySearch2(nums, 0, nums.length - 1, target);
}
    private static  int performBinarySearch2(int[] nums, int start, int end, int target) {
        int mid = (start + end) / 2;

        if (start <= end) {
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                return performBinarySearch2(nums, start, mid - 1, target);
            else
                return performBinarySearch2(nums, mid + 1, end, target);
        } else{
            return start;
        }
    }
}
