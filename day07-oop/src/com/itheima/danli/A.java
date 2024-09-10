package com.itheima.danli;

public class A {
    private A(){}
    private static A a = new A();
    public static A getInstance(){
        return a;
    }

}
