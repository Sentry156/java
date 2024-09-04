package com.itheima.extends2modifier;

public class Test {
    public static void main(String[] args) {
        FU f = new FU();
       // f.show(); 使用private修饰的方法只能在本类中访问
        f.nullA();
        f.protectedA();
        f.publicA();
    }
}
