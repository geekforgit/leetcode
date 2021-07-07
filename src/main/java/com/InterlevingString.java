package com;

public class InterlevingString {

    public static void main(String[] args) {
        System.out.println( isInterleave("aabcc","dbbca","aadbbcbcac"));
        //InterlevingString interlevingString = new InterlevingString();
    }
    private static boolean isInterleave(String s1, String s2, String s3) {
        int i =0; //for s1
        int j =0; //for s2
        int k = 0; // for s3
        if(s1.length()+s2.length()>s3.length())
            return false;
        while(i<s1.length() || j<s2.length()){
            if(s3.charAt(k)==s1.charAt(i)){
                k++;
                i++;
            }else if(s3.charAt(k)==s2.charAt(j)){
                k++;
                j++;
            }else{
                return false;
            }
        }

        return true;
    }
}
