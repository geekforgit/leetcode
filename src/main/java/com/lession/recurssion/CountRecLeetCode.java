package com.lession.recurssion;

public class CountRecLeetCode {
    public static void main(String[] args) {
        countStep(50);
    }

    static void countStep(int num) {
        System.out.println(count(num, 0));
    }

    private static int count(int num, int step) {
        if (num == 0)
            return step;
        if (num % 2 == 0)
            return count(num / 2, step + 1);
        else
            return count(num -1, step+1);
    }
}
