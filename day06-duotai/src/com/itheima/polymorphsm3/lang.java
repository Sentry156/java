package com.itheima.polymorphsm3;

public class lang extends Animal {
    @Override
    public void run()
    {
        System.out.println("狼跑的贼快");
    }
    //狼吃羊
    public void eat()
    {
        System.out.println("狼吃羊");
    }
}
