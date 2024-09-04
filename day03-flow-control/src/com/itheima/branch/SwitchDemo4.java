package com.itheima.branch;

public class SwitchDemo4 {
    public static void main(String[] args) {
        test1("周日");
    }
    public static void test1(String week){
        switch(week){
            case "周一":
                System.out.println("埋头苦干，改bug");
                break;
            case "周二":
                System.out.println("请程序员大牛解决问题");
                break;
            case "周三":
                System.out.println("请程序员大牛解决问题");
                break;
            case "周四":
                System.out.println("请程序员大牛解决问题");
                break;
            case "周五":
                System.out.println("自己整理代码");
                break;
            case "周六":
                System.out.println("打游戏");
                break;
            case "周日":
                System.out.println("打游戏");
                break;
            default:
                System.out.println("星期信息有误");
                break;
        }
    }
}
