package com.itheima.branch.demo;

import java.util.Scanner;

public class AddDemo {
    public static void main(String[] args) {
        calc();
    }
    public static void  calc(){
        double a,b;
        double result=0;
        String symbol;
        System.out.println("请输入第一个数");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        System.out.println("请输入第二个数");
        b = sc.nextDouble();
        System.out.println("请输入符号");
        symbol = sc.next();
        switch(symbol){
            case "+":
                result = a+b;
                break;
            case "-":
                result = a-b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if(b==0){
                    System.out.println("错误!!!! 分母为0不能除");
                    break;
                }
                result = a/ b;
                break;
            default:
                System.out.println("符号错误");
                break;
        }
        System.out.println("结果"+result);
    }
}
