package com.itheima.branch;

import java.util.Scanner;

public class SwitchDemo3 {
    public static void main(String[] args) {
        getSex();
    }
    public static void getSex(){
        String sex;
        Scanner sc = new Scanner(System.in);
        sex = sc.next();
        switch(sex){
            case "男":
                System.out.println("推荐<Java从入门到精通>");
                break;
            case "女":
                System.out.println("推荐<<javascript从入门到精通>>");
                break;
            default:
                System.out.println("男不男女不女，不推荐");
                break;
        }
    }
}
