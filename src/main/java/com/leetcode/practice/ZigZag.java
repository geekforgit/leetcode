package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class ZigZag {
    public static void main(String[] args) {
        System.out.println( convert("PAYPALISHIRING",4));
    }
    public static String convert(String s, int numRows) {
        Map<Integer,String> data = new HashMap<>();
        int inc = 1;
        int count= 0;
        String result =  new String();
        for(int i =0; i<s.length();i++){
            String temp;
            if(count==numRows){
                inc =-1;
            }
            if(count==1){
                inc =1;
            }
            count +=inc;
            System.out.println("i value: "+i+ " "+count);
            if(data.containsKey(count)){
                temp=data.get(count)+s.charAt(i);
                data.put(count,temp);
            }else
            data.put(count,s.charAt(i)+"");
        }
        for(Integer i: data.keySet()){
            result+=data.get(i);
        }
        return result;
    }
}
