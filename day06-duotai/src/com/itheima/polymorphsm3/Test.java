package com.itheima.polymorphsm3;

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
        if(a instanceof wg){
            wg w1 = (wg) a;
            w1.zoom();
        }else if(a instanceof lang){
            lang l1 =(lang) a;
            l1.eat();
        }
    }
}
