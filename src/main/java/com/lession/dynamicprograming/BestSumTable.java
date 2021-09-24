package com.lession.dynamicprograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BestSumTable {
    public static void main(String[] args) {
        System.out.println(bestSum(7, new int[]{1, 3, 4, 5, 2, 7}));
    }

    static List<Integer> bestSum(int target, int[] nums) {
        List<List<Integer>> table = new ArrayList<>(target + 1);
        for (int i = 0; i <= target; i++) {
            table.add(null);
        }
        table.set(0, new ArrayList<>());
        for (int j = 0; j <= target; j++) {
            if (table.get(j) != null) {
                for (int k = 0; k < nums.length; k++) {
                    List<Integer> temp = new ArrayList<>(table.get(j));
                    temp.add(nums[k]);
                    if (j + nums[k] <= target) {
                        if (table.get(j + nums[k]) == null || (table.get(j + nums[k]).size() > temp.size())) {
                            table.set(j + nums[k], temp);
                        }
                    }
                }
            }


        }
        return table.get(target);
    }
}
