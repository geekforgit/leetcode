package com.lession.dynamicprograming;

public class MaximumSubarray {
    public static void main(String[] args) {
        System.out.println(getMax(new int[]{1,2,3,-1,-3},0,-1));
    }
    static int getMax(int[] nums,int result,int i){
        int max =0;
       if(i>nums.length){
           return result;
       }
       if(max<result){
           max = result;
       }
       for(int j =0 ; j<nums.length;j++){
            result = result+getMax(nums,result,i+1);

       }
       return nums[i];
    }
}
