package com.zjb.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CarProxy implements InvocationHandler {

    private static Car car;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("run".equals(method.getName())) {
            System.out.println("Car is ready to run...");
            method.invoke(car, args);
        }
        if("repair".equals(method.getName())) {
            System.out.println("Car is ready to repair...");
            return method.invoke(car, args);
        }
        return null;
    }

    public static Car createProxy(Car c) {
        car = c;
        return (Car)Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(), new CarProxy());
    }
}
