package com.lession.dynamicprograming.memoization;

import com.lession.Util;

public class MinCostMatrixTravel implements Print {
    public static void main(String[] args) {
        Util util = new Util();
        util.accept(new MinCostMatrixTravel());
    }

    public static int minCostMatrixTravel(int[][] arr2d) {
        int[][] dp = new int[arr2d.length][arr2d[0].length];
        for (int i = dp.length - 1; i >= 0; i--) {
            for (int j = dp[0].length - 1; j >= 0; j--) {
                if (i == dp.length - 1 && j == dp[0].length - 1) {
                    dp[i][j] = arr2d[i][j];
                } else if (i == dp.length - 1) {
                    dp[i][j] = arr2d[i][j] + dp[i][j + 1];
                } else if (j == dp[0].length - 1) {
                    dp[i][j] = arr2d[i][j] + dp[i + 1][j];
                } else {
                    dp[i][j] = arr2d[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        // if(dp[dp.length-1][dp[0].length-1])

        return dp[0][0];
    }

    @Override
    public void printData() {
        int[][] arr2d = new int[][]{
                new int[]{2, 1, 1, 2},
                new int[]{3, 4, 5, 1},
                new int[]{1, 3, 2, 6},
                new int[]{5, 2, 1, 9}
        };
        System.out.println("Min Cost to Reach:" + minCostMatrixTravel(arr2d));
    }
}
