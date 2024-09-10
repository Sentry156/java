package com.itheima.interfaceDemo3;

public class Test {
    public static void main(String[] args) {
        Student [] allStudents = new Student[10];
        allStudents[0] = new Student("张三",'男',80);
        allStudents[1] = new Student("李四",'男',90);
        allStudents[2] = new Student("王五",'男',70);
        allStudents[3] = new Student("赵六",'男',50);
        allStudents[4] = new Student("孙七",'男',49);
        allStudents[5] = new Student("周八",'男',99);
        allStudents[6] = new Student("五九",'男',98);
        allStudents[7] = new Student("正使",'男',97);
        allStudents[8] = new Student("奥利给",'男',65);
        allStudents[9] = new Student("翠花",'女',72);
        printlnAll p1 = new classDataimpl1(allStudents);
        p1.printStudentAll();
        p1.printStudentSco();
    }
}
