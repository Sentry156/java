package com.itheima.branch.demo;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println(getCode(4));
    }
    public static String getCode(int number){
       String code = "";
        for(int i=0;i<number;i++){
           int  type = (int)(Math.random()*3);
           switch(type){
               case 0:
                 int num = (int)(Math.random()*10);
                 code += num;
                 break;
               case 1:
                  int num1 = (int)(Math.random()*26);
                  char ch = (char)('A'+num1);
                  code+=ch;
                  break;
               case 2:
                   int num2 = (int)(Math.random()*26);
                   char ch1 = (char)('a'+num2);
                   code+=ch1;
                   break;
           }
        }
        return code;
    }
}
