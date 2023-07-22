package com.lession.recurssion;

public class StringPermutation {
    public static void main(String[] args) {
        permutation("ABC","");
    }
    static void permutation(String ret,String prefix){
        if(ret.length()==0)
            System.out.println(prefix);
        else{
            for(int i=0;i<ret.length();i++){
                String rem=ret.substring(0,i)+ret.substring(i+1);
                permutation(rem,prefix+ret.charAt(i));
            }
        }

    }
}
