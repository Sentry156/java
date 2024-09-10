package com.itheima.Demo;

import java.util.Scanner;

public class SmartControl {
    private JD[] jd;
    public void Control(JD jd) {
        jd.press();
        System.out.println(jd.getName() + "开关状态："+(jd.isStatus()?"开":"关"));
        jx(this.jd);
    }
    public void printAllStatus(JD[] jd){
        for(int i=0;i<jd.length;i++){
            System.out.println(jd[i].getName()+"开关状态："+(jd[i].isStatus()?"开":"关"));
        }
    }
    public void setControl(JD[] jd){
        this.jd = jd;
        System.out.println("请选择需要控制的家电 0:小米电灯,1:小米电视,2:洗衣机,3:空调");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        Control(jd[index]);
    }
    public void jx(JD[] jd){
        Scanner scanner = new Scanner(System.in);
        System.out.println("是否继续操作：是：1  否：0");
        int index = scanner.nextInt();
        if(index == 1 ) {
            setControl(jd);
        }else{
            //输出所有家电状态
            printAllStatus(jd);
            System.out.println("结束操作");
        }


    }
}
