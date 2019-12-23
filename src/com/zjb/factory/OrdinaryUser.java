package com.zjb.factory;

public class OrdinaryUser implements User {
    @Override
    public double cacl(double price) {
        return price * 0.9;
    }

    @Override
    public void regist() {
        UserFactory.regist("ORDINARY", this);
    }
}
