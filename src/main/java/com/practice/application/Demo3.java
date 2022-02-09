package com.practice.application;

public class Demo3 {
    //convert binary to decimal using a recursive function
    public static void main(String[] args) {
        int binary = 0100101;
        int expo =0;
        System.out.println(binaryCalculation(binary,expo));
    }
    static double binaryCalculation(int binary,int expo){

        if(binary==0){
            return 0;
        }

        return (binary%10)+2*Math.pow(binary,expo)+binaryCalculation(binary/10,expo++);


    }

}
