package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class PalindromPart {
    public static void main(String[] args) {
        System.out.println(getPartList("aab"));
    }
    static List<List<String>> getPartList(String input){
        List<List<String>> result = new ArrayList<>();
        List<String> list =new ArrayList<>();
        char[] inputChar = input.toCharArray();
        for(char c: inputChar){
           list.add(c+"");
        }
        result.add(list);
        for(int i = 0;i<inputChar.length;i++){
            String palindrom = "";
            List<String> list2 =new ArrayList<>();
            for(int j = i+1;j<inputChar.length;j++){
                palindrom+= String.valueOf(inputChar[i])+String.valueOf(inputChar[j]);
                if(isPalindrm(palindrom)){
                    list2.add(palindrom);
                }else{
                 break;
                }
            }
            if(!list2.isEmpty()) result.add(list2);
        }
        return  result;
    }

    private static boolean isPalindrm(String palindrom) {
        return palindrom.equals(new StringBuilder(palindrom).reverse().toString());
    }
}
