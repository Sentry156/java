package com.itheima.branch.loop;

public class ForDemo2 {
    public static void main(String[] args) {
        System.out.println(getSum2());
    }
    public static int getSum(){
        int sum  = 0;
        for(int i =1;i<=5;i++){
            sum += i;
        }
        return sum;
    }
    public static int getSum2(){
        int sum = 0;
        for(int i=1;i<=10;i++){
            if(i%2==1){
                sum+=i;
            }
        }
        return sum;
    }
}
