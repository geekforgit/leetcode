package com.practice.application;

import java.util.*;
interface Climb{
    boolean isTooHigh(int height, int limint);
}

class App {
    private  static void check(Climb climb,int height){
        if(climb.isTooHigh(height,10))
            System.out.println("too highg");
        else
            System.out.println("ok");
    }

    public static void main(String args[]) {

      //check((h,l)->h.append(l).isEmpty(),5);
    }



}