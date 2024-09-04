package com.itheima.branch.loop;

public class whileDemo1 {
    public static void main(String[] args) {
        System.out.println(getMoney());
    }
    public static int getMoney(){
       double money = 100000;
       double rate = 0.017;
       int i  = 0;
       while(money<=200000){
           money = money * (1 + rate);
           i++;
       }
       return i;
    }
}
