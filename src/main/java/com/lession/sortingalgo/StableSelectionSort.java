package com.lession.sortingalgo;

import java.util.Arrays;

public class StableSelectionSort {
    public static void main(String[] args) {
        int[] result=performSelctionSort(new int[]{10,2,3,60,3,1,-2});
        Arrays.stream(result).forEach(System.out::println);
    }


    private static int[] performSelctionSort(int[] ints) {
        for (int i =0;i<ints.length-1;i++){
            int min=i;
            for(int j=i+1;j<ints.length;j++){
                if(ints[min]>ints[j]){
                    min=j;
                }
            }
            int key = ints[min];
            while(min>i){
                ints[min]=ints[min-1];
                min--;
            }
            ints[i]=key;

        }
        return ints;
    }

}
