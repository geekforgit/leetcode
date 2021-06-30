package com.leetcode.practice;

public class StringCompression {
    public static void main(String[] args) {
        //System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c','c'}));
       // System.out.println(compress(new char[]{'a'}));
       // System.out.println(compress(new char[]{'a', 'a', 'a', 'b', 'b', 'c','c','c'}));
        System.out.println(compress(new char[]{'a',  'b', 'c'}));
    }

    public static int compress(char[] chars) {

        char temp = '0';
        int start = 0;

        int len = 1;
        if (chars.length == 1) {
            return 1;
        }
        for (int j = 0; j < chars.length - 1; j++) {
            temp = chars[j];
            if (temp == chars[j + 1]) {
                len++;
            } else {
                chars[start] = temp;
                if (len > 1) {
                    String lenStr = String.valueOf(len);
                    for (char c : lenStr.toCharArray()) {
                        chars[++start] = c;
                    }
                }

                len = 1;
               start++;

            }
        }
        if(chars[chars.length-1]==chars[chars.length-2])
            chars[start] = temp;

        if (len > 1) {
            String lenStr = String.valueOf(len);
            for (char c : lenStr.toCharArray()) {
                chars[++start] = c;
            }
        }

        start++;
        System.out.println(new String(chars));
        return start;
    }
}
