package com.zjb.proxy;

public class Haval implements Car {

    private int speed;

    public Haval(int speed) {
        this.speed = speed;
    }

    @Override
    public void run() {
        System.out.println("Haval is running: " + speed);
    }

    @Override
    public String repair() {
        return "REPAIRED";
    }
}
