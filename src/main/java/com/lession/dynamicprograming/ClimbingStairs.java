package com.lession.dynamicprograming;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbTrees(3,0, new HashMap<Integer,Integer>()));
    }
   static int climbTrees(int n, int result, Map<Integer,Integer> memo){
       if(n<0) return 0;
       if(memo.containsKey(n)) return memo.get(n);
        if(n==0){
            result++;
        }
        result = result + climbTrees(n-1,result,memo)+climbTrees(n-2,result,memo);
        memo.put(n,result);
        return result;
    }
}
