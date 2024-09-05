package com.itheima.polymorphsm3;

public class wg extends Animal {
    @Override
    public void run()
    {
        System.out.println("乌龟跑的贼慢");
    }
    //乌龟缩头
    public void zoom()
    {
        System.out.println("乌龟缩头");
    }
}
