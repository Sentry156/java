package com.itheima.abstract3;

public abstract class people {
    public final void write(){
        System.out.println("<我的爸爸>");
        System.out.println("我爸爸是一个好人.......");
//        System.out.println("我爸爸经常让我站在这里别动，他要去买几斤橘子");
        writeMain();
        System.out.println("我爸爸真好，你有这样的爸爸吗?");
    }
    public abstract void writeMain();
}
