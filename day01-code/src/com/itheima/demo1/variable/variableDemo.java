package com.itheima.demo1.variable;

public class variableDemo {
    public static void main(String[] args) {
        //认识变量
        printVariable();
    }

    public   static void printVariable(){
        //定义变量
        int age = 18; //整形
        System.out.println(age);
        double score = 90.5;
        System.out.println(score);
        System.out.println("----------------");
        int number = 19;
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println("-------------");
        int age2 = 19;
        age2 += 1;
        System.out.println(age2);
        System.out.println("-----------------------");
        double money = 9.9;
        System.out.println("发红包");
        money = money - 5;
        System.out.println(money);
        System.out.println("收红包");
        money = money + 6;
        System.out.println(money);
    }
}
