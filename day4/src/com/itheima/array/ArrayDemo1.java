package com.itheima.array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        randomCall();
    }
    public static void randomCall(){
        String[] namse = {"张三","李四","王五","赵六","孙七","周八","吴九"};
        int index = (int)(Math.random()*namse.length);
        String name = namse[index];
        System.out.println(name);
    }
}
