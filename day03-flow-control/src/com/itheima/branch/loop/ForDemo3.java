package com.itheima.branch.loop;

public class ForDemo3 {
    public static void main(String[] args) {
    printStart();
    }
    public static void printStart(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
