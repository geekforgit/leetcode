package com.lession.dynamicprograming;

import java.util.ArrayList;
import java.util.function.Function;

public class BestSum {
    public static void main(String[] args) {
        System.out.println(bestSum(8, new int[]{2, 4, 3}));
        //bestSum(8, new int[]{2, 4, 3}).forEach(System.out::println);
    }

    static ArrayList<Integer> bestSum(int target, int[] numbers) {
        if (target == 0) return new ArrayList<Integer>();
        if (target < 0) return null;

        ArrayList<Integer> shortestCombination = null;
        for (int i = 0; i < numbers.length; i++) {
            int remainder = target - numbers[i];
            ArrayList<Integer> combination = bestSum(remainder, numbers);
            if (combination != null) {
                combination.add(numbers[i]);
                if (shortestCombination == null || shortestCombination.size() > combination.size()) {
                    shortestCombination = combination;
                }
            }
        }
        return shortestCombination;
    }

}
