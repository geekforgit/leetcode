package com.lession.dynamicprograming.memoization;

import java.util.Date;

public class FibMemo {
    public static void main(String[] args) {
        long time = new Date().getTime();
        int val = 100;
        System.out.println("Start in :  " + new Date());
       // System.out.println(fibN(40));
        System.out.println(fib(val,new  long[val+1]));
        System.out.println("Time taken: " + (new Date().getTime() - time) + " ms");
    }

    private static long fib(int val, long[] arr) {
        if (val == 0 || val == 1) return 1;
        if (arr[val] != 0) return arr[val];
        arr[val] = fib(val - 1, arr) + fib(val - 2, arr);
        return arr[val];

    }

    private static int fibN(int val) {
        if (val == 0 || val == 1) return 1;
        return fibN(val - 1) + fibN(val - 2);
    }
}
