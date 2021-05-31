package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

/*Given a string s, find the length of the longest substring without repeating characters.



        Example 1:

        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.*/
public class LongestSubstring {
    public static void main(String[] args) {
        String s = "";
        System.out.println("Longest substring is: "+ lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.isBlank() && s.isEmpty())
            return 0;
        int res = 1;
        char[] x = s.toCharArray();
        Map<Character, Character> search;
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            search = new HashMap<>();
            search.put(x[i], x[i]);
            for (int j = i + 1; j < s.length() ; j++) {
                if (!search.containsKey(x[j])) {
                    count++;
                    search.put(x[j], x[j]);
                }else{
                    break;
                }
            }
            if(res<count)
                res = count;
        }
        return res;

    }
}
