package com.lession.recurssion;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(5427));
    }

    private static int sumOfDigit(int n) {
        if (n % 10 == n) return n;
        return sumOfDigit(n / 10) + n % 10;
    }
}
