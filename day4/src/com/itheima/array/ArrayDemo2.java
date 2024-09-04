package com.itheima.array;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        inputScore();
    }
    public static void inputScore(){

        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[8];
        for(int i=0;i<scores.length;i++){
            int i1 = i+1;
            System.out.println("请输入第"+i1+"个学生的成绩");
            scores[i] = scanner.nextDouble();
        }
        double max = scores[0];
        double min = scores[0];
        double sum = 0;
        for(int i=0;i<scores.length;i++){
            sum+=scores[i];
            max = scores[i]>max?scores[i]:max;
            min = scores[i]<min?scores[i]:min;
        }
        System.out.println("平均分："+(sum/scores.length)+" 最高分："+max+" 最低分："+min);
    }
}
