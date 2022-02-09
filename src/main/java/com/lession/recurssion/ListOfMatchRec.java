package com.lession.recurssion;

import java.util.Arrays;

public class ListOfMatchRec {
    public static void main(String[] args) {
        int[] res=findNumberOfOccurrences(new int[]{10,3,10,5,10,5,10,7},0,10,0);
        for(int x:res)
            System.out.println(x);

    }
    private static int[] findNumberOfOccurrences(int[] arr,int index,int data,int arrLen){
        if(index == arr.length) return  new int[arrLen];
        if(arr[index]==data) {
            int[] finalArray = findNumberOfOccurrences(arr, index + 1, data, arrLen+1);
            finalArray[arrLen] =index;
            return finalArray;
        }else{
            int[] finalArray = findNumberOfOccurrences(arr, index + 1, data, arrLen);
            return finalArray;
        }
    }
}
