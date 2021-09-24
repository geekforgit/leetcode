package com.leetcode.practice.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindJudge {
    public static void main(String[] args) {
        System.out.println(findJudge(4, new int[][]{{1, 3}, {2, 3}, {4, 1}}));
    }

    public static int findJudge(int n, int[][] trust) {
        if (n == 1 && trust.length == 0) return 1;
        Set<Integer> nonTrusted = new HashSet<>();
        Set<Integer> trusted = new HashSet<>();

        for (int[] personTrust : trust) {
            nonTrusted.add(personTrust[0]);
            trusted.add(personTrust[1]);
        }

        trusted.removeAll(nonTrusted);

        int townJudge = trusted.iterator().hasNext() ? trusted.iterator().next() : -1;
        int trustCount =0;
        for(int i=0;i<trust.length;i++){
            if(trust[i][1]==townJudge){
                trustCount++;
            }
        }
        return trustCount==n-1?townJudge:-1;
    }
}
