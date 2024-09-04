package com.itheima.branch;

public class ifDemo2 {
    public static void main(String[] args) {
        goCar();
    }
    public static void goCar(){
        boolean red = false;
        boolean green = true;
        boolean yellow = false;
        if(red){
            System.out.println("红灯停");
        }else if(green){
            System.out.println("绿灯行");
        }else if(yellow){
            System.out.println("黄灯警告");
        }else {
            System.out.println("信号灯故障");
        }
    }
}
