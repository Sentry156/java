package com.itheima.interfaceDemo;

public interface A {
    //1.接口里只能定义常量
    //2.接口里只能定义抽象方法
    //3.接口不能创建对象
    //4.接口定义常量时可以省略public static final
    int NUM = 10;
    void run();
    String go();
}
