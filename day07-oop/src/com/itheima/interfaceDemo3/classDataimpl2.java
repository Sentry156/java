package com.itheima.interfaceDemo3;

public class classDataimpl2 implements printlnAll{
    private Student[] student;
    public classDataimpl2(){}
    public classDataimpl2(Student [] students){
        this.student = students;
    }
    @Override
    public void printStudentAll() {
        int n = 0;
        for(int i=0;i<student.length;i++){
            if(student[i].getSex()=='男') n++;
            System.out.println("姓名:"+student[i].getName()+",性别:"+student[i].getSex()+",成绩:"+student[i].getSco());
        }
        System.out.println("男生人数为:"+n+"女生人数为:"+(student.length-n));
    }

    @Override
    public void printStudentSco() {
        double score=0.0;
        double Max = student[0].getSco();
        double Min = student[0].getSco();
        for(int i=0;i<student.length;i++){
            score+=student[i].getSco();
            if(Max<student[i].getSco()){
                Max = student[i].getSco();
            }
            if(Min>student[i].getSco()){
                Min = student[i].getSco();
            }
        }
        score/=(student.length);
        System.out.println("平均成绩为"+score);
        System.out.println("最高分为:"+Max+"最低分为:"+Min);
    }
}
