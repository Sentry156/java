package com.itheima.oop.staticfield;

public class Test {
    public static void main(String[] args) {
        Stydent.name = "张三";
        Stydent s1 = new Stydent();
        s1.name = "李四";
        Stydent s2 = new Stydent();
        s2.name = "王五";
        System.out.println(s2.name); //王五
        System.out.println(s1.name); // 李四
        System.out.println(Stydent.name); //张三
        s1.age = 23;
        s2.age = 18;
        System.out.println(s1.age);
        System.out.println(s2.age);
    }
}
