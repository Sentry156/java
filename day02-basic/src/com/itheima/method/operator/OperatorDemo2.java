package com.itheima.method.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
//    print(60);
        maxNum(10,20,30);

    }
    public static void print(int score){
        String result = score>=60?"通过":"挂科";
        System.out.println(result);
    }
    public static void maxNum(int a,int b,int c){
        int max = a>b?a:b>c?b:c;
        System.out.println(max);
    }

}
