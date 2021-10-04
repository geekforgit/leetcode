package com.practice.application;

import java.util.ArrayList;
import java.util.List;

//one string, list of substring .. find the maximun of matching substring
public class Demo2 {
    public static void main(String[] args) {
        String str = "Gaurav";
        List<String> subStr = new ArrayList<>();
        subStr.add("Gau");
        subStr.add("ra");
        subStr.add("Gaura");
        int max =0;
        String result =new String();
        for(int i =0;i<str.length()-1;i++){
            for(int j =0;j<str.length()-i;j++){
                String temp = str.substring(i,str.length()-j);
                if(subStr.contains(temp)){
                    if(max<temp.length()){
                        max = temp.length();
                        result = temp;
                    }
                }
            }
        }
        System.out.println(result);

    }



}
