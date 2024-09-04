package com.itheima.extendsDemo;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher("张三",'男',"java,前端");
        System.out.println(t.getName()+t.getSex()+t.getSkill());
    }
}
