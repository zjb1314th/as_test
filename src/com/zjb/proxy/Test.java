package com.zjb.proxy;

public class Test {

    public static void main(String[] args) {

        Car c = CarProxy.createProxy(new Geely(120));

        c.run();
        System.out.println(c.repair());
    }
}
