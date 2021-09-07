package com.lession.dynamicprograming;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subRes2 = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> subRes = new ArrayList<>();

            if (i == 0) {
                subRes.add(1);
                result.add(subRes);
                continue;
            }
            subRes.add(1);
            for (int j = 0; j < i - 1; j++) {
                subRes.add(subRes2.get(j) + subRes2.get(j + 1));
            }
            subRes.add(1);
            result.add(subRes);
            subRes2=subRes;
        }
        return result;
    }
}
