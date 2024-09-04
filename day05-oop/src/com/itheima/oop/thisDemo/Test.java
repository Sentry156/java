package com.itheima.oop.thisDemo;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.print();
        System.out.println("--------------");
        s1.name = "汪苏泷";
        s1.printHobby("唱歌！");
    }
}
