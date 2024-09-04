package com.itheima.extends2modifier;

public class FU {

    private void show(){
        System.out.println("private 方法");
    }
    void nullA(){
        System.out.println("无修饰的方法");
    }
    protected void protectedA(){
        System.out.println("protected修饰的方法");
    }
    public void publicA(){
        System.out.println("public修饰的方法");
    }

    public static void main(String[] args) {
        FU f = new FU();
        f.show();
        f.nullA();
        f.protectedA();
        f.publicA();
    }
}
