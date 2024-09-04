package com.itheima.extends5override;

public class Test {
    public static void main(String[] args) {
      Cat cat = new Cat();
      cat.cry();
    }
}
class Cat extends Animal{
    @Override //方法重写的校验注解
    public void cry(){
        System.out.println("喵喵喵");
    }
}
class Animal{
        public void cry(){
            System.out.println("动物会叫");
        }
}
