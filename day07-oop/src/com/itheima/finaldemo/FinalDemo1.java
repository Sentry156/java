package com.itheima.finaldemo;

public class FinalDemo1 {
    public static void main(String[] args) {
        final double PI = 3.14;
//        PI = 3.15;  被final修饰的变量有且仅能被赋一次值
    }
}
final class  A{}
//class B extends A{
//    被final修饰的类不能被继承
//}
class C{
    public final void show(){
        System.out.println("被final修饰的方法不能被重写");
    }
}
class D extends C{
//    @Override
//    public void show(){
//        System.out.println("子类不能重写父类的final方法");
//    }
}

