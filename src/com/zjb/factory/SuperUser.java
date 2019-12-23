package com.zjb.factory;

public class SuperUser implements User {
    @Override
    public double cacl(double price) {
        return price * 0.7;
    }

    @Override
    public void regist() {
        UserFactory.regist("SUPER", this);
    }
}
