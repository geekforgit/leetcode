package com.practice.application;

import javax.swing.plaf.nimbus.State;

enum StateO {
    T1, T2;
}

public class Print {

    public static void main(String[] args) {
        StateO curr = StateO.T1;
        StateO next = StateO.T2;

        T1 t1 = new T1(curr, next);
        t1.start();
        T2 t2 = new T2(next, curr);
        t2.start();
    }
}

class T1 extends Thread {
    StateO curr;
    StateO next;

    public T1(StateO current, StateO next) {
        this.curr = current;
    }

    @Override
    public void run() {
        while (true) {
            if (curr == next) {
                System.out.println("Gaurav");
                next = StateO.T2;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class T2 extends Thread {
    StateO curr;
    StateO next;

    public T2(StateO current, StateO next) {
        this.curr = current;
    }

    @Override
    public void run() {
        while (true) {
            if (curr == next) {
                System.out.println("Jha");
                next = StateO.T1;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
