package com.lession;

import com.lession.dynamicprograming.memoization.Print;

import java.util.Date;
import java.util.function.Consumer;

public class Util implements Consumer {

    @Override
    public void accept(Object o) {
        long time = new Date().getTime();
        Print p = (Print)o;
        p.printData();
        System.out.println("Time taken to execute: "+(new Date().getTime()-time) + "ms");
    }
}
