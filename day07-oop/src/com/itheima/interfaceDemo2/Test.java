package com.itheima.interfaceDemo2;

public class Test {
    public static void main(String[] args) {
//        People s1 = new Student();
//        s1.say();
//        Driver s2 = new Student();
//        s2.drive();
        Student s3 = new Student();
        s3.play();
        s3.drive();
        s3.eat();
    }
}
class People{
    public void say(){
        System.out.println("说话");
    }
    public void eat(){
        System.out.println("吃饭");
    }
}
interface Driver{
    void drive();
}
interface BoyFriend{
    void play();
}
class Student extends People implements Driver,BoyFriend{
    @Override
    public void play() {
        System.out.println("谈恋爱");
    }

    @Override
    public void drive() {
        System.out.println("会开车");
    }
}
class Teacher extends People implements Driver{
    @Override
    public void drive() {
        System.out.println("开车技术更高");
    }
}
