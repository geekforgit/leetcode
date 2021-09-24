package com.leetcode.practice;

public class SearchRange {
    public static void main(String[] args) {
        System.out.println(searchRange(new int[]{1,2,2,3},2));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        int l=-1;
        int r=-1;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i])
            {
                if(result[0]!=-1)
                    result[1]=i;
                else
                    result[0]=i;
            }
        }
        if(result[0]!=-1){
            if(result[1]==-1){
                result[1]=result[0];
            }
        }
        return result;

    }
}
