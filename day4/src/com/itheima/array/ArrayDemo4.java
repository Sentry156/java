package com.itheima.array;

public class ArrayDemo4 {
    public static void main(String[] args) {
        printArray2();
    }
    public static void printArray(){
        String[][] classroom = {
                {"张无极", "赵敏", "张无忌",},
                { "张强", "张三丰","奥利给"},
                {"灭绝","李四","王五"},
                {"翠花","熊大","建国"}
        };
        String[] names = classroom[0];
       for(int i=0;i<names.length;i++){
           System.out.println(names[i]);
       }
    }
    public static void printArray2(){
        String[][] classroom = {
                {"张无极", "赵敏", "张无忌",},
                { "张强", "张三丰","奥利给"},
                {"灭绝","李四","王五"},
                {"翠花","熊大"}
        };
        for(int i=0;i<classroom.length;i++){
            for(int j=0;j<classroom[i].length;j++){
                System.out.print(classroom[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}
