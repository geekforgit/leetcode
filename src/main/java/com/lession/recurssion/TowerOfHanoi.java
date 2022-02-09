package com.lession.recurssion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        toh(3, "A", "B", "C");
    }

    public static void toh(int n, String t1id, String t2id, String t3id) {
        if (n == 0) return;
        toh(n - 1, t1id, t3id, t2id);
        System.out.println(n + " " + t1id + " --> " + t2id);
        toh(n - 1, t3id, t2id, t1id);
    }
}
