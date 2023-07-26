package com.lession.dynamicprograming.memoization;

import com.lession.Util;

public class ClimbingStairsWithMinimumMoves implements Print{
    public static void main(String[] args) {

        Util util = new Util();
        util.accept(new ClimbingStairsWithMinimumMoves());
    }

    public static int climbingStairsMWithMinMoves(int[] arr){
       int n = arr.length;
       Integer[] dp= new Integer[n+1];
       dp[n] = 0;
       for(int i = n-1;i>=0;i--){
           Integer min = Integer.MAX_VALUE;
           if(arr[i]!=0) {
               for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
                   min = Math.min(min, dp[i+j]);
               }
               if(min!=Integer.MAX_VALUE)
                   dp[i]=min+1;
           }
           System.out.println(dp[i]);
       }
       return dp[0];
    }
    @Override
    public void printData() {
        System.out.println("Climbing stairs with min moves: " +climbingStairsMWithMinMoves(new int[]{2,3,1,3,1}));
    }
}
