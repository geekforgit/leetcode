package com.leetcode.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombPhone {
    public static void main(String[] args) {
        letterCombinations("234");
    }

    public static List<String> letterCombinations(String digits) {
        Map<String, String> mapping = new HashMap<>();
        mapping.put("2", "abc");
        mapping.put("3", "def");
        mapping.put("4", "ghi");
        mapping.put("5", "jkl");
        mapping.put("6", "mno");
        mapping.put("7", "pqrs");
        mapping.put("8", "tuv");
        mapping.put("9", "wxyz");
        StringBuilder str = new StringBuilder();
        List<String> result = new ArrayList<>();
        result = solve(digits, 0, mapping, str, result);
        return result;
    }

    private static List<String> solve(String digit, int i, Map<String, String> mapping, StringBuilder str, List<String> result) {

        if (i == digit.length()) {
            result.add(str.toString());
        } else {
            String s = mapping.get(digit.charAt(i) + "");
            for (int j = 0; j < s.length(); j++) {
                str.append(s.charAt(j));
                solve(digit, i + 1, mapping, str, result);
                str.deleteCharAt(str.length()-1);
            }
        }
        return result;
    }
   /* private static List<String> getSolution(String digits, Map<String, String> mapping) {
        List<String> combination = new ArrayList<>();
        List<String> result = new ArrayList<>();
        if(digits.isEmpty()){
            return result;
        }
        if(digits.length()==1){
            String s = mapping.get(digits);

            ArrayList res=  new ArrayList<String>();
            for(char c:s.toCharArray()){
                res.add(""+c);
            }
            return res;
        }
        for (int i = 0; i < digits.length(); i++) {
            combination.add(mapping.get("" + digits.charAt(i)));
        }
        for (int j = 0; j < combination.get(0).length(); j++) {
            String c = "" + combination.get(0).charAt(j);
            String temp = "";
            int limit = 1;
            *//*for(int k =1;k<=combination.size()-1;k++){
     *//**//* for(int l = 0;l<combination.get(k).length()-1;l++) {
                    c = c + combination.get(k).charAt(l);
                }*//**//*
                c=c+combination.get(k).charAt(j);
            }*//*

            while (limit < combination.size()) {
                for(int k =0;k<=combination.get(limit).length()-1;k++) {
                    result.add(c + combination.get(limit).charAt(k));

                }
                limit++;
            }

        }

        return result;

    }*/
}
