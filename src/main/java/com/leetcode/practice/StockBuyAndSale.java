package com.leetcode.practice;

//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/564/
public class StockBuyAndSale {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                max = max + (prices[i + 1] - prices[i]);
            }
        }
        return max;
    }
}
