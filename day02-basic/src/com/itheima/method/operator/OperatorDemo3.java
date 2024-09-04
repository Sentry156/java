package com.itheima.method.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        System.out.println(Obj(171,62,'男'));
    }
    public static boolean Obj(double height,double width,char sex){
        boolean flag = false;
        flag = height>170&width>=60&width<= 80 & sex =='女';
        return flag;
    }
}
