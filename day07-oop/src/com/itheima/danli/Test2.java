package com.itheima.danli;

public class Test2 {
    public static void main(String[] args) {
        B b1 = B.getInstance();
        B b2 = B.getInstance();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1==b2);
    }
}
