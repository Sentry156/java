package com.itheima.method;

public class TypeDemo1 {
    public static void main(String[] args) {
      double d =   calc(10,20,30.5,'+');
      System.out.println(d);
    }
    public static double calc(int a,int b,double c,char r){
        return a+b+c+r;
    }
}
