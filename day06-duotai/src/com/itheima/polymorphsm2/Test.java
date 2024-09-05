package com.itheima.polymorphsm2;

public class Test {
    public static void main(String[] args) {
        Animal a = new lang();
        Animal b = new wg();
        go(a);
        go(b);
    }
    public static void go(Animal a){
        System.out.println("开始.......");
        a.run();
    }
}
