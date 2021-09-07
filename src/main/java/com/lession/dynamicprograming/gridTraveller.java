package com.lession.dynamicprograming;

import java.util.Arrays;

public class gridTraveller {
    public static void main(String[] args) {
        System.out.println(gridT(3,3));
    }
    static int gridT(int rows,int cols){
        //create the 2d table to store the state
        int[][] table = new int[rows+1][cols+1];
        for(int[] tab:table)
            Arrays.fill(tab, 0);

        //define base cases
        table[1][1] = 1;
        for(int i = 0;i<=rows;i++){
            for(int j=0;j<=cols;j++){
                if(j+1<=cols) table[i][j+1]+=table[i][j];
                if(i+1<=rows)table[i+1][j]+=table[i][j];
            }
        }

        return table[rows][cols];
    }
}
