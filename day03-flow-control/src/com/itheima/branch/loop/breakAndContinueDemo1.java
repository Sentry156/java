package com.itheima.branch.loop;

public class breakAndContinueDemo1 {
    public static void main(String[] args) {
//        test1();
        test2();
    }
    public static void test1(){
        for(int i =0;i<10;i++){
            if(i==5)break;
            System.out.println(i);
        }
    }
    public static void test2(){
        for(int i=0;i<10;i++){
            if(i==5)continue;
            System.out.println(i);
        }
    }
}
