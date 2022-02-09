package com.lession.recurssion;

public class CountZero {
    public static void main(String[] args) {
        countZero(4020350);
    }

    static void countZero(int num) {
        System.out.println(count(num, 0));
    }

    private static int count(int num, int sum) {
        if (num == 0)
            return sum;
        if (num % 10 == 0)
            return count(num / 10, sum + 1);
        else
            return count(num / 10, sum);
    }
}
