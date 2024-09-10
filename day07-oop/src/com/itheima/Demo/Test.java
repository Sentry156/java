package com.itheima.Demo;

public class Test {
    public static void main(String[] args) {
        JD[] jd = new JD[4];
        jd[0] = new Lamp("小米电灯",false);
        jd[1] = new TV("小米电视",false);
        jd[2] = new WashMachine("洗衣机",false);
        jd[3] = new Air("空调",false);
        //创建智能控制系统
//        SmartControl smartControl = new SmartControl(jd[0]);
        SmartControl s1 = new SmartControl();
        s1.printAllStatus(jd);
        s1.setControl(jd);

    }
}
