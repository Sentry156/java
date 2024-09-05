package com.itheima.Demo;

public class goldCard extends card{
    public goldCard(String name,String cardID,String phone,double money){
       super(name,cardID,phone,money);
    }
    @Override
    public void payMoney(double money){
        double temp = getMoney();
        System.out.println("您的当余额为"+temp);
        if(temp<money){
            System.out.println("余额不足，请充值");
            return;
        }
        System.out.println("支付成功");
        System.out.println("您的消费金额为"+(money*0.8));
        xc((money*0.8));
        System.out.println("您的余额为"+(temp-money*0.8));
    }
    public void xc(double money){
        if(money>=200){
            System.out.println("消费达标，获得洗车劵一张");
        }
    }
}
