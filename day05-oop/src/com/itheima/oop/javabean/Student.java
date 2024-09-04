package com.itheima.oop.javabean;

public class Student {
   private  String name;
   private int age;
   private char sex;
    public Student(){}
    public Student(int age, char sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }
}
