package com.lession.dynamicprograming;

import java.util.ArrayList;
import java.util.List;

public class GeneratePranthesis {

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        int n =3;
        genPranthesis("",0,0,n,result);
        System.out.println(result);
    }


    static void genPranthesis(String param, int open, int close, int n, List<String> result) {
        if(open==close && open ==n) {
            System.out.println(param);
            result.add(param);
        }

        if(open<n){
            genPranthesis(param+"(",open+1,close,n,result);
        }
        if(close<open){
            genPranthesis(param+")",open,close+1,n,result);
        }

}

}
