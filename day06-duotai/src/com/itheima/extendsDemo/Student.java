package com.itheima.extendsDemo;

public class Student extends Object{
    private String name;
    private char sex;
    private int age;
    private String school;
    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}';
    }
    public Student(String name,char sex,int age){
        this(name,sex,age,"黑马程序员");
    }
    public Student(String name,char sex,int age,String school){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.school = school;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
