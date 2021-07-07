package com.leetcode.practice;

public class RotateArray {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7},7);
    }
    public static void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        int pos =0;
        for(int i = nums.length-1;i>nums.length-k-1;i--){
            res[pos++]=nums[i];
        }
        for(int i = 0;i<nums.length-k;i++){
            res[pos++]=nums[i];
        }
        for(int t: res){
            System.out.print(t+", ");
        }
    }
    public static void rotate2(int[] nums, int k) {
        int temp = 0;
    }
}
