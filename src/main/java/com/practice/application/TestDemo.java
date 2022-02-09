package com.practice.application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//2nd maximum occurance of words
// Interview is with gaurav jha. gaurav jha is good human being.
// gaurav is from citi bank
public class TestDemo {

    public static void main(String[] args) {
        String inputString = "Interview is with gaurav . " +
                "gaurav jha is good human being. "+
                "gaurav is from citi bank.";

        get2ndMaxOccurance(inputString.split(" "));
    }

    static String get2ndMaxOccurance(String[] stringArr){
        Map<String, Integer> words = new TreeMap<>();
        for(String str: stringArr)
        {
            if(str.contains(".")){
                str=str.substring(0,str.length()-1);
            }

            if(words.containsKey(str)){
                int count = words.get(str);
                count = count+1;
                words.put(str,count);
            }
            else
                words.put(str,1);
        }
        int max = Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        String max2Word= new String();
        String maxWord= new String();
        for(String key: words.keySet()){
            int count = words.get(key);
            if(count>max){
                max2 = max;
                max2Word = maxWord;
                max = count;
                maxWord = key;
            }

        }
        System.out.println(max2Word);
        return  max2Word;

    }


}
