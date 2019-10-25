package com.zjb.proxy;

public class Geely implements Car {

    private int speed;

    public Geely(int speed) {
        this.speed = speed;
    }

    @Override
    public void run() {
        System.out.println("Geely is running: " + speed);
    }

    @Override
    public String repair() {
        return "SCRAP";
    }
}
