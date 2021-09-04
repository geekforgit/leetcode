package com.lession.dynamicprograming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoinChange {
    static List<List<Integer>> setOfCoins = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(findCoin(5, new int[]{1, 2, 5},0,new HashMap<String,Integer>()));


    }

    static int findCoin(int num, int[] coins, int start, Map<String,Integer> memo) {

        if (num == 0) return 1;
        String key = num+","+start;
        if(memo.containsKey(key)) return memo.get(key);
        int count = 0;
        for (int i = start; i < coins.length; ++i) {
            int remainder = num - coins[i];
            if (remainder >= 0) {
                int temp = findCoin(remainder, coins,i,memo);
                count = count + temp;
            }
        }
        memo.put(key,count);
        return count;
    }
}
