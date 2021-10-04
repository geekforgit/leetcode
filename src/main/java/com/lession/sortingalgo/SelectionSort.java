package com.lession.sortingalgo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] result=performSelctionSort(new int[]{10,2,3,60,1,-2});
        Arrays.stream(result).forEach(System.out::println);
    }

    static int[] performSelctionSort(int[] nums){
        for(int i =0;i<nums.length-1;i++){
            int min_index=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[min_index]>nums[j]){
                    min_index=j;
                }
            }
            swap(nums,i,min_index);
        }
        return nums;

    }

    private static void swap(int[] nums,int i, int min_index) {
        int temp = nums[min_index];
        nums[min_index]=nums[i];
        nums[i]=temp;
    }
}
