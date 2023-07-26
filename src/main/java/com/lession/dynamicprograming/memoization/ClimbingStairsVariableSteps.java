package com.lession.dynamicprograming.memoization;

import com.lession.Util;

public class ClimbingStairsVariableSteps implements Print {
    public static void main(String[] args) {
        Util util = new Util();
        util.accept(new ClimbingStairsVariableSteps());
    }
    public static int climbingStairsWithVariableSteps(int[] vars){
        int n = vars.length;
        int[] dp = new int[n+1];
        dp[n] = 1;
        for(int i = n-1;i>=0;i--){
            for(int j =1;j<=vars[i] & i+j<dp.length;j++){
                dp[i]+=dp[i+j];
            }
            System.out.println(dp[i]);
        }
        return dp[0];
    }

    @Override
    public void printData() {
        System.out.println("Number of ways: " +climbingStairsWithVariableSteps(new int[]{2,3,1,3,1}));
    }
}
