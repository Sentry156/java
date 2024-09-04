package com.itheima.branch.loop;

public class doWhileDemo1 {
    public static void main(String[] args) {
        printHelloword();
    }
    public static void printHelloword(){
        int i = 0;
        do{
            System.out.println("HelloWord");
            i++;
        }while(i<3);
    }
}
