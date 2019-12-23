package com.zjb.factory;

public class Main {

    public static void main(String[] args) {
        double price = UserFactory.getUserByType("ORDINARY").cacl(100);

        System.out.println("本次消费：" + price);
    }

    static {
        new OrdinaryUser().regist();
        new VIPUser().regist();
        new SuperUser().regist();
    }
}
