package com.itheima.method;
import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args) {
            printUserInfo();
    }
    public static void printUserInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        System.out.println("您叫"+username);
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("您多少岁"+age);
    }
}
