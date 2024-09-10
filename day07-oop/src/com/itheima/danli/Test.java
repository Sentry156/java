package com.itheima.danli;

public class Test {
    public static void main(String[] args) {
        A a1 = A.getInstance();
        System.out.println(a1);
        A a2 = A.getInstance();
        System.out.println(a2);
        System.out.println(a1==a2);
    }
}
