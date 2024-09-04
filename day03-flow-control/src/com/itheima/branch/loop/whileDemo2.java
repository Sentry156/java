package com.itheima.branch.loop;

public class whileDemo2 {
    public static void main(String[] args) {
        System.out.println(getHeight());
    }
    public static int getHeight(){
        double height = 8848860;
        double h = 0.1;
        int i = 0;
        while(h<=8848860){
            h = h + h;
            i++;
        }
        return i;
    }
}
