package com.lession.dynamicprograming;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {

    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        genPascal(numRows,0,result);
        return result;
    }
    void genPascal(int num,int index,List<List<Integer>> result){

    }
}
