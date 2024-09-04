package com.itheima.extends3;

import com.itheima.extends2modifier.FU;

public class Demo {
    public static void main(String[] args) {
        FU f1 = new FU();
        // f.show(); 使用private修饰的方法只能在本类中访问
        //   f.nullA();
        //    f.protectedA();
        f1.publicA();
    }
}
