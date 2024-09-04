package com.itheima.oop;

public class Test {
    public static void main(String[] args) {
        Star s1 = new Star();
        s1.name = "王宝强";
        s1.age = 35;
        s1.gender = "男";
        s1.height = 1.75;
        s1.weight = 80;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gender);
        System.out.println(s1.height);
        System.out.println(s1.weight);
        System.out.println("-------------------------");
        Star s2 = new Star();
        s2.name = "刘诗诗";
        s2.age = 28;
        s2.gender="女";
        s2.height = 1.65;
        s2.weight = 55;
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.gender);
        System.out.println(s2.height);
        System.out.println(s2.weight);

    }
}
