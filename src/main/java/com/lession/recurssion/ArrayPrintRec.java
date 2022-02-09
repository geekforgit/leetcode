package com.lession.recurssion;

public class ArrayPrintRec {
    public static void main(String[] args) {
        arrayPrint(new int[]{10, 20, 30, 40}, 0);
        arrayPrintR(new int[]{10, 20, 30, 40}, 0);
    }

    private static void arrayPrint(int[] arr, int index) {
        if (index == arr.length) return;
        System.out.println(arr[index]);
        arrayPrint(arr, index + 1);
    }

    private static void arrayPrintR(int[] arr, int index) {
        if (index == arr.length) return;
        arrayPrintR(arr, index + 1);
        System.out.println(arr[index]);
    }
}
