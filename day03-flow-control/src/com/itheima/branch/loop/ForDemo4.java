package com.itheima.branch.loop;

public class ForDemo4 {
    public static void main(String[] args) {
            getTable();
    }
    public static void getTable(){
        for(int i=1;i<=9;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j+"x"+i+"="+j*i);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
