package com.leetcode.practice;

public class FirstBadVersionBinarySearch {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(3));
    }
    public static int firstBadVersion(int n) {
        int start=1;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)){
                end=mid-1;
            }
            else start=mid+1;
        }
        return start;
    }

    private static boolean isBadVersion(int mid) {
        return false;// implementation code in leetcode
    }

}
