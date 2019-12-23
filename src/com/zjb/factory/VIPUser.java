package com.zjb.factory;

public class VIPUser implements User {
    @Override
    public double cacl(double price) {
        return price * 0.8;
    }

    @Override
    public void regist() {
        UserFactory.regist("VIP", this);
    }
}
