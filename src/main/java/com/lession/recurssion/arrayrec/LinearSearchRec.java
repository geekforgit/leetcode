package com.lession.recurssion.arrayrec;

public class LinearSearchRec {
    public static void main(String[] args) {
        System.out.println(searchL(new int[]{1, 54, 3, 56, 0, 343,}, 4, 0));
    }

    private static boolean searchL(int[] arr, int target, int i) {
        if (arr.length-1<i)
            return false;
        return arr[i] == target || searchL(arr, target, i + 1);
    }
}
