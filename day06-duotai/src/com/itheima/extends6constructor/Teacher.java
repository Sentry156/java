package com.itheima.extends6constructor;

public class Teacher extends People{
    private String skill; //技术

    public Teacher(String name, char sex, String skill) {
        super(name,sex);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
