package com.leetcode.practice;

//algorithm Divide and Conquer used to break the problems into parts and solving them
//below example is to get minimum and maximum from array
public class DAC {
    public static void main(String[] args) {
        int[] nums = {2,3,4,12,45,223,9,0,453};
        System.out.println("Maximum is : "+ daxMax(nums,0,nums.length));
    }

    static int daxMax(int[] nums, int index, int len) {
        if(index>=len-2){
            if(nums[index]>nums[index+1]){
                return  nums[index];
            }else{
                return nums[index+1];
            }
        }
        int max = daxMax(nums,index+1,nums.length);
        if(max>nums[index])
            return max;
        else
            return  nums[index];
    }
}
