package com.itheima.extends5override;

public class Test2 {
    public static void main(String[] args) {
        Student s = new Student("张三",'男',18);
        System.out.println(s);
    }

}
class Student extends Object{
    private String name;
    private char sex;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
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

    public Student(){}
    public Student(String name,char sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
