package com.leetcode.practice;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(solution(123));
        /*System.out.println(123%10);
        System.out.println(123/10);
        System.out.println(12%10);
        System.out.println(12/10);
        System.out.println(1%10);
        System.out.println(1/10);*/
    }

    public static int solution(int num) {
        long result = 0;
        boolean sign = false;
        if (num == 0)
            return (int) result;
        if(num<0){
            num*=-1;
            sign = true;
        }
        while (num > 0) {
            result = (result * 10) + (num % 10);
            num = num / 10;
        }
        if (result >= Integer.MAX_VALUE) {
            return 0;
        }
        return sign?(int) result:(int) result*-1;
    }
}
