package com.itheima.method.operator;

import java.util.Scanner;

public class OperatorDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height,width;
        String sex;
        System.out.println("请输入身高\n");
        height = sc.nextDouble();
        System.out.println("请输入体重\n");
        width = sc.nextDouble();
        System.out.println("请输入性别");
        sex = sc.next();
        System.out.println(calc(height,width,sex));;
    }
    public static String calc(double h,double w,String s){
        double bmi = w/(h*h);
        String result="";
        if(bmi>34){
            result = "非常肥胖";
        } else if(bmi>=28&bmi<=34){
            result = "肥胖";
        } else if(bmi>=24&bmi<28){
            result = "偏重";
        }else if(bmi>=18.5&bmi<24){
            result = "适中";
        }else if(bmi<18.5){
            result = "过轻";
        }
        return result;
    }
}
