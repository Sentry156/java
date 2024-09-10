package com.itheima.interfaceDemo5;

public class Test {
    public static void main(String[] args) {
        D1 d = new D1();
        d.show();
    }
}
//interface A1{
//    void show();
//}
//interface B1{
//    String show();
//}
//interface C1 extends A1,B1{
//
//}
class Animal{
  public void show(){
       System.out.println("Animal的show");
    }
}
class D1 extends Animal implements A {}

interface A{
   default void show(){
       System.out.println("接口中的show方法");
   };
}
interface B{
}
interface C extends A,B{

}