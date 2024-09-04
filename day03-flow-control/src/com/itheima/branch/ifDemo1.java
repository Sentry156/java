package com.itheima.branch;

import java.util.Scanner;

public class ifDemo1 {
    public static void main(String[] args) {
//        int age ;
//        System.out.println("请输入年龄");
//        Scanner sc = new Scanner(System.in);
//        age = sc.nextInt();
//        System.out.println(getResult(age));
//        System.out.println( money(8));;
        System.out.println( score(59));;
    }
    public static String getResult(int age){
        String result = "";
        if(age>=18){
            result = "可以上网";
            return result;
        }
        result = "洗洗睡吧";
        return result;
    }
    public static String money(int money){
        String result = "";
        if(money>=80){
            result = "转账成功";
        }else{
            result = "转账失败";
        }
        return result;
    }
    public static String score(int score){
        String result = "";
        if(score>=90&score<=100){
            result = "A+";
        }else if(score>=80&score<90){
            result = "A";
        }else if(score>=70&score<80){
            result = "B";
        }else if(score>=60&score<70){
            result = "C";
        }else if(score>=0&score<60){
            result = "D";
        }
        return result;
    }
}
