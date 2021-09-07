package com.lession.dynamicprograming;

public class JumpGame {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
    }

    public static boolean canJump(int[] nums) {
        boolean result = false;
        int reach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (reach >= nums.length - 1) return true;
            if (reach < i) return false;
            reach = Math.max(i + nums[i], reach);
        }


        return result;
    }
}
