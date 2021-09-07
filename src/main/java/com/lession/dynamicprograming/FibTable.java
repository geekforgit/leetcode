package com.lession.dynamicprograming;

import java.util.Arrays;

public class FibTable {
    public static void main(String[] args) {
        System.out.println(fib(8));
    }

    static int fib(int num) {
        int[] table = new int[num+1];
        Arrays.fill(table,0);
        table[1]=1;
        for(int i = 0;i<num;i++){
            table[i+1]+=table[i];
            if(i+2<table.length)
            table[i+2]+=table[i];
        }
        return table[num];
    }
}
