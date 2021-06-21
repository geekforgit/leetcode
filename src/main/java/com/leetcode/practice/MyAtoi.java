package com.leetcode.practice;

public class MyAtoi {
    public static void main(String[] args) {
       // System.out.println(Math.max(Long.MAX_VALUE,9223372036854775808);
        System.out.println(myAtoi("21474836460"));
    }

    public static int myAtoi(String s) {
        int pos = 0;
        int sign = 1;
        long res = 0;
        boolean isSigned = false;
        int numLength = 0;
        while (pos < s.length()) {
            if (res*sign >= Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else if (res*sign <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (s.charAt(pos) == ' ' && numLength>=0 ) {
                pos++;
                continue;
            }
          /*  if(numLength>0 && (s.charAt(pos) == '+' || s.charAt(pos) == '-')){
                return 0;
            }*/
            if (isSigned && (s.charAt(pos) == '+' || s.charAt(pos) == '-')) {
                return 0;
            }
            if (s.charAt(pos) == '-' && res == 0) {
                sign = -1;
                pos++;
                isSigned= true;
                continue;
            }
            if (s.charAt(pos) == '+' && res == 0) {
                sign = 1;
                pos++;
                isSigned= true;
                continue;
            }
            if (Character.isDigit(s.charAt(pos))) {
                res = (res * 10) +Character.getNumericValue(s.charAt(pos));
                numLength++;
                pos++;
            } else {
                return (int) res*sign;
            }

        }
        if (res*sign >= Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if (res*sign <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) res*sign;

    }
}
