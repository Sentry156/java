package com.itheima.array;

public class ArrayTest4 {
    public static void main(String[] args) {
        start();
    }
    public static void start(){
        String[] poker = new String[54];
        String[] colros = {"♦","♣","❤","♠"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int index = 0;
        for(int i=0;i< numbers.length;i++){
            for(int j=0;j<colros.length;j++){
                poker[index++] = colros[j]+numbers[i];
            }
        }
        poker[index++] = "小王";
        poker[index] = "大王";
        for(int i=0;i<poker.length;i++){
            System.out.print(poker[i]);
            System.out.print(" ");

        }
    }
}
