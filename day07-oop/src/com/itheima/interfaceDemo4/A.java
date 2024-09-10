package com.itheima.interfaceDemo4;

public interface A {
    //默认方法 用default修饰
     default void go(){

        System.out.println("go方法执行了");
         run();
    }
    //使用private 修饰的方法只能在当前接口中调用
    private void run(){
        System.out.println("run方法执行了");
    }
    // static 修饰 的方法只能本类调用
    static void show(){
        System.out.println("chow 方法调用了");
    }
}
