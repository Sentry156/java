package com.itheima.interfaceDemo3;

public class classDataimpl1 implements printlnAll{
    private Student[] student;
    public classDataimpl1(){}
    public classDataimpl1(Student [] students){
       this.student = students;
    }


    @Override
    public void printStudentAll() {
        for(int i=0;i<student.length;i++){
            System.out.println("姓名:"+student[i].getName()+",性别:"+student[i].getSex()+",成绩:"+student[i].getSco());
        }
    }

    @Override
    public void printStudentSco() {
        double score=0.0;
        for(int i=0;i<student.length;i++){
            score+=student[i].getSco();
        }
        score/=(student.length);
        System.out.println("平均成绩为"+score);
    }
}
