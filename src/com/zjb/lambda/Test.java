package com.zjb.lambda;

public class Test{

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Test Noname");
            }
        }).start();
        new Thread(() -> System.out.println("Test Lambda")).start();
    }
}
