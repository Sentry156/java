package com.itheima.branch.demo;

import java.util.Random;
import java.util.Scanner;

public class Demo2 {
    //猜数字游戏
    public static void main(String[] args) {
        guessNumber();
    }
    //随机生成一个1-100的数字让用户猜
   public static void guessNumber(){
       int userGuess;
       Scanner sc = new Scanner(System.in);
       Random rd = new Random();
       int randomNumber = rd.nextInt(100) + 1;
       System.out.println("请输入一个1-100的数字:");
       do{
           userGuess = sc.nextInt();
           if(userGuess>randomNumber){
               System.out.println("猜大了");
           } else if (userGuess<randomNumber) {
               System.out.println("猜小了，请重试");
           } else{
               System.out.println("恭喜你，猜对啦");
               System.out.println("如需重新挑战请输入1");
               if(sc.nextInt()==1){
                   guessNumber();
               }
               System.out.println("游戏结束！！！");
               break;
           }
       }while(true);
   }

}
