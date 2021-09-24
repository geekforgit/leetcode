package com.lession.dynamicprograming;

import java.util.Arrays;

public class canSum {
    public static void main(String[] args) {
        System.out.println(canSum(7, new int[]{2, 3, 5}));
    }

    static boolean canSum(int target, int[] nums) {
        boolean[] table = new boolean[target + 1];
        Arrays.fill(table, false);
        table[0] = true;
        for (int i = 0; i <= target; i++) {
            if (table[i]) {
                for (int j = 0; j <= nums.length - 1; j++) {
                    if (i + nums[j] <= target) table[i + nums[j]] = true;
                }
            }
        }
        return table[target];
    }
}
