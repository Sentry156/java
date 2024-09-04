package com.itheima.oop.thisDemo;

public class Student {
    String name;
    public Student(){

    }
    public void print(){
        System.out.println(this);
    }
    public void printHobby(String name){
        System.out.println(this.name+"喜欢"+name);
    }
}
