package com.practice.application;

public class Thread1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread name is: " + Thread.currentThread().getName());
                throw new RuntimeException("Intentional error");
            }
        });
        thread.setName("Worker Thread");
        thread.setUncaughtExceptionHandler((t, e) ->
                System.out.println("Unexpected error has been identified thread: "+t.getName()+" -->" + e.getMessage()));
        System.out.println("Before Thread name is: " + Thread.currentThread().getName());
        thread.start();

        System.out.println("After Thread name is: " + Thread.currentThread().getName());
        Thread.sleep(1000);
    }
}
