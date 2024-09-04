package com.itheima.extends4Demo;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}
class Fu{
    String name = "Fu的name";
}
class Zi extends Fu{
    String name = "子的name";
    public void show(){
        String name = "show的name";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
