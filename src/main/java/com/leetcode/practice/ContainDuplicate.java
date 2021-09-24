package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class ContainDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> numCount = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            if(numCount.containsKey(nums[i]))
                return true;
            else
                numCount.put(nums[i],i);
        }
        return false;

    }
}
