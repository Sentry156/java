package com.itheima.extends6constructor;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
    }
}
class Zi extends Fu{

    public Zi(){
        super(0);
        System.out.println("子类的构造器触发了");

    }
}
class Fu{
    public Fu(){
        System.out.println("父类的无参构造器");
    }
    public Fu(int a){
        System.out.println("父类的有参构造器");
    }
}
