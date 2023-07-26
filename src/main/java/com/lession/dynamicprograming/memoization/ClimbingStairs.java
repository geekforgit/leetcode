package com.lession.dynamicprograming.memoization;

import com.lession.Util;

//Number of ways to climb, jumps can be 1,2,3
public class ClimbingStairs implements Print {
    int n = 100;

    public static void main(String[] args) {
        Util util = new Util();
        util.accept(new ClimbingStairs());
    }

    public static long climbingStairs(int n, long[] qb) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        if (qb[n] != 0) return qb[n];
        long w1 = climbingStairs(n - 1, qb);
        long w2 = climbingStairs(n - 2, qb);
        long w3 = climbingStairs(n - 3, qb);
        qb[n] = w1 + w2 + w3;
        return qb[n];
    }

    public static long climbingStairsTab(int n) {
        long[] dp = new long[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1)
                dp[i] = dp[i - 1];
            else if (i == 2)
                dp[i] = dp[i - 1] + dp[i - 2];
            else
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }

    @Override
    public void printData() {
        //System.out.println("ways to climb by memoiazation: " + climbingStairs(n, new long[n + 1]));
        System.out.println("ways to climb by memoiazation: " + climbingStairsTab(n));
    }
}
