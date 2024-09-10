package com.itheima.interfaceDemo3;

public class Student {
    private String name;
    private char sex;
    private double sco;
    public Student(){}
    public Student(String name,char sex,double sco){
        this.name = name;
        this.sex = sex;
        this.sco = sco;
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

    public double getSco() {
        return sco;
    }

    public void setSco(double sco) {
        this.sco = sco;
    }
}
