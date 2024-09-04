package com.itheima.oop;

public class Student {
    String name;
    double chinese;
    double math;
    public void printAll(){
        System.out.println(name+"的总成绩为："+(chinese+math)+"\t平均成绩为："+(chinese+math)/2);
    }
}
