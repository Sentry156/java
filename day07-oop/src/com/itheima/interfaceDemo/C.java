package com.itheima.interfaceDemo;
//实现类，通过 implements 关键字实现接口
// 实现类可以实现多个接口
// 实现类必须重写接口里所有的抽象方法
public class C implements A,B{
    @Override
    public void run() {
        System.out.println("跑");
    }

    @Override
    public String go() {
        System.out.println("走");
        return "";
    }

    @Override
    public void play() {
        System.out.println("玩");

    }
}
