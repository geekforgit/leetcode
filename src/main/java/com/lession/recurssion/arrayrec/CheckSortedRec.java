package com.lession.recurssion.arrayrec;

public class CheckSortedRec {
    public static void main(String[] args) {
        System.out.println(sorted(new int[]{1,20,3,4,5},0));
    }

    private static boolean sorted(int[] arr,int index) {
        if(arr.length-1==index)
            return true;
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}
