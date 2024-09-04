package com.itheima.oop.privateDemo;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        System.out.println(s.getName());
        s.setAge(18);
        System.out.println(s.getAge());
    }
}
