package com.leetcode.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MatchingSubSequence {
    public static void main(String[] args) {
        new MatchingSubSequence().numMatchingSubseq("abcde", new String[]{"a", "bb", "acd", "ace"});
    }
        public int numMatchingSubseq(String s, String[] words) {
            Map<Character, ArrayList<Integer>> map = new HashMap<>();
            int count =0;
            for(int i = 0 ;i<s.length();i++){
                if(map.containsKey(s.charAt(i))){
                    map.get(s.charAt(i)).add(i);
                }else{
                    ArrayList<Integer> value = new ArrayList<Integer>();
                    value.add(i);
                    map.put(s.charAt(i),value);
                }
            }
            for(String word: words){
                int current = -1;
                boolean possible = true;
                for(int k = 0;k< word.length();k++){
                    if(map.containsKey(word.charAt(k))){
                        boolean found=false;
                        for(Integer j:map.get(word.charAt(k)))
                        {
                            if(j>current){
                                current =j;
                                found=true;
                                break;
                            }
                        }
                        if(!found){
                            possible = false;
                            break;
                        }

                    }else{
                        possible =false;
                        break;
                    }
                }
                if(possible){
                    count+=1;
                }
            }
            return count;
        }

}
