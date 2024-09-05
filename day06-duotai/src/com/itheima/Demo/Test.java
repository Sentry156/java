package com.itheima.Demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //定义一个卡片类，包含车主信息、车主姓名、电话号码、卡片余额
        //卡片类包含存钱和消费功能
        //金卡需重写消费方法
        goldCard g1 = new goldCard("张三","123456789","123456789",5000);
        yinCard y1 = new yinCard("李四","987654321","987654321",3000);
        go(g1);
        go(y1);
    }
    public static void go(card d){
        double money;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入消费金额：");
        money = sc.nextDouble();
        d.payMoney(money);
    }
}
