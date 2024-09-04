package com.itheima.method;

public class MethodDemo1 {
    public static void main(String[] args) {
        printHelloword();
        getSum(1,2);
    }
    //定义一个方法，求任意两个整数的和并返回
    public static int getSum(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static void printHelloword(){
        System.out.println("helloword");
    }

}
