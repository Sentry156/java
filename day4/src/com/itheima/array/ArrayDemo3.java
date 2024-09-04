package com.itheima.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] scores = {15,9000,10000,20000,9500,-5};
        int max = getMax(scores);
        int min = getMin(scores);
        System.out.println(max);
        System.out.println(min);
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            max = max>arr[i]?max:arr[i];
        }
        return max;
    }
    public static int getMin(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            min = min<arr[i]?min:arr[i];
        }
        return min;
    }
}
