package com.lession.recurssion;

public class PowerOfN {
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
    public static int power(int x, int n){
        if(n==0) return 1;
        int xnm1 = power(x,n-1);
        int xn = x*xnm1;
        return  xn;
    }
}
