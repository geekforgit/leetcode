package com.lession.recurssion;

public class RevNumRec {
    static int sum = 0;
    public static void main(String[] args) {

        rev(1842);
        System.out.println(sum);
        int value = 43567;
        System.out.println(rev2(value,(int)Math.log10(value)+1));
    }
    static void rev(int n){
        if(n==0){
            return;
        }
        sum = sum*10+n%10;
        rev(n/10);

    }
    static int rev2(int num,int count){
        if(num==0) return 0;
        return  ((num%10)*(int)Math.pow(10,count-1) + rev2(num/10,count-1));
    }
}
