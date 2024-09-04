package com.itheima.branch.demo;

public class Demo4 {
    public static void main(String[] args) {
        for(int i=101;i<=200;i++){
            if(getNumber(i)){
                System.out.println(i);
            }
        }
    }
    public  static  boolean getNumber(int number){
        if(number<=1){
            return false;
        }
        for( int i=2;i<=number/2;i++){
            if(number % i == 0) return false;
        }
        return true;
    }

}
