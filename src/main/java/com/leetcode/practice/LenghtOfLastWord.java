package com.leetcode.practice;

public class LenghtOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a bcds  "));
    }
    private static int lengthOfLastWord(String s) {
        int pos=0;
        if(s.isEmpty()|| s.trim().isEmpty())
            return 0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                pos++;
            }else{
                if(pos!=0){
                    return pos;
                }
            }
        }
        return pos;

    }
}
