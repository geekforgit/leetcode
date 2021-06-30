package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class kthElementLexi {
    public static void main(String[] args) {
        System.out.println(new kthElementLexi().getHappyString(3,10));
    }

    public String getHappyString(int n, int k) {

        String[] set = new String[]{"a", "b", "c"};
        List<String> res = new ArrayList<>();
        boolean found = new kthElementLexi().compute("", res, n, k, set);
        if (found)
            return res.get(res.size() - 1);
        return "";
    }

    public boolean compute(String sub, List<String> res, int n, int k, String[] set) {

        if (sub.length() > 1 && String.valueOf(sub.charAt(sub.length() - 1)).equals(String.valueOf(sub.charAt(sub.length() - 2))))
            return false;

        if (sub.length() == n) {
            res.add(sub);
            if (res.size() == k)
                return true;
            return false;
        }

        for (int i = 0; i <= 2; i++) {
            if (compute(sub + set[i], res, n, k, set))
                return true;
        }
        return false;
    }

}
