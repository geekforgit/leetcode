package com.lession.dynamicprograming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class BestSum {
    public static void main(String[] args) {
        System.out.println(bestSum(8, new int[]{1, 4, 5},new HashMap<Integer,ArrayList<Integer>>()));
        //bestSum(8, new int[]{2, 4, 3}).forEach(System.out::println);
    }

    static ArrayList<Integer> bestSum(int target, int[] numbers, Map<Integer,ArrayList<Integer>> memo) {
        if(memo.containsKey(target)) return memo.get(target);
        if (target == 0) return new ArrayList<Integer>();
        if (target < 0) return null;

        ArrayList<Integer> shortestCombination = null;
        for (int i = 0; i < numbers.length; i++) {
            int remainder = target - numbers[i];
            ArrayList<Integer> remcombination = bestSum(remainder, numbers,memo);
            if (remcombination != null) {
                ArrayList<Integer> combination = new ArrayList<>(remcombination);
                combination.add(numbers[i]);
                if (shortestCombination == null || shortestCombination.size() > combination.size()) {
                    shortestCombination = combination;
                }
            }
        }
        memo.put(target,shortestCombination);

        return shortestCombination;
    }

}
