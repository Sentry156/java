package com.itheima.extendsDemo;

public class Teacher extends People{
    private String skill;
    public Teacher(String name,char sex,String skill){
        this.setName(name);
        this.setSex(sex);
        this.skill = skill;
    }
    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
