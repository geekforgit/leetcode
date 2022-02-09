package com.lession.recurssion;

public class MaxOfArrayRec {
    public static void main(String[] args) {
        System.out.println(maxOfArray(new int[]{10,40,3,45,11},0));
    }
    private static int maxOfArray(int[] arr,int index){
        if(index==arr.length-1) return arr[index];
        int misa = maxOfArray(arr,index+1);
        if(misa>arr[index]){
            return misa;
        }else return arr[index];

    }
}
