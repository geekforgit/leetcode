package com.lession.recurssion;

public class FindInArryRec {
    public static void main(String[] args) {
        System.out.println(findNumberFirst(new int[]{10,20,4,5,3,4,7},0,4));
        System.out.println(findNumberLast(new int[]{2,4,20,4,5,3,0,7},0,4));
    }

    private static int findNumberFirst(int[] arr,int index,int data){
        if(index==arr.length) return -1;
        if(arr[index]==data) return index;
        else return findNumberFirst(arr,index+1,data);
    }
    private static int findNumberLast(int[] arr,int index,int data){
        if(index==arr.length) return -1;

        int li = findNumberLast(arr,index+1,data);
        if(li!=-1) return li;
        else if(arr[index]==data) return index;
        else return -1;
    }
}
