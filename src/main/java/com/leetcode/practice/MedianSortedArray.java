package com.leetcode.practice;

public class MedianSortedArray {

    public static void main(String[] args) {
        int[] nums1 ={1,2};
        int[] nums2 ={3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x;
        int y;
        double median;

        double[] sortedArray = merge(nums1, nums2, nums1.length, nums2.length);
        x = (sortedArray.length) / 2;
        y = (sortedArray.length) % 2;

        if (y != 0) {
            median = sortedArray[x] / 2;
        } else {
            median = (sortedArray[x] + sortedArray[x - 1]) / 2;
        }
        return median;
        /*//case 1: nums1>nums2
        if (nums1.length > nums2.length) {
            if (y != 0 && nums1.length > x) {
                median = nums1[x];
            } else {
                median = (nums1[x] + nums1[x - 1]) / 2;
            }
            return median;
        }
        if (nums1.length < nums2.length) {
            if (y != 0 ) {
                x = (x+1)-nums1.length;
                median = nums2[x];
            } else {
                x = (x+1)-nums1.length;
                median = (nums1[x] + nums1[x + 1]) / 2;
            }
            return median;
        }
        if(nums1.length == nums2.length){
            median = (nums1[nums1.length -1 ]+nums2[0])/2;
            return median;
        }*/
    }

    private static double[] merge(int[] nums1, int[] nums2, int l1, int l2) {
        int i = 0;
        int j = 0;
        int k = 0;
        double[] result = new double[l1 + l2];
        while (i < l1 && j < l2) {
            if (nums1[i] < nums2[j])
                result[k++] = nums1[i++];
            else
                result[k++] = nums2[j++];
        }
            while (i < l1)
                result[k++] = nums1[i++];
            while (j < l2)
                result[k++] = nums2[j++];


        return result;
    }
}
