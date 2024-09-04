package com.itheima.oop.obj;

public class Student {
    String name;
    double height;
    public Student(){
        System.out.println("无参构造器触发了");
    }
    public Student(String n){
        name = n;
    }
}
