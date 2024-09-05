package com.itheima.Demo;

public class card {
    private String name;
    private String cardID;
    private String phone;
    private double money;//余额
    public card(){}
    public card(String name,String cardID,String phone,double money){
        this.name=name;
        this.cardID=cardID;
        this.phone=phone;
        this.money=money;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    //存钱方法
    public void saveMoney(double money)
    {
        this.money+=money;
    }
    //消费方法
    public void payMoney(double money)
    {
        this.money-=money;
    }

}
