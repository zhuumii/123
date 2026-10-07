package com.zhumi.variable;

public class VariableDome1 {


    public static void main(String[] args) {
//    微信余额:0元
//    支付宝余额:10元
//    银行卡余额:20 元
//    问题一:请问现在一共有多少钱?
//    问题二:微信收了10元红包，又发了2元红包，余额多少?

        //1.设置一个变量储存微信余额
        double wx = 0.0;
        //2.设置一个变量储存支付宝余额
        double zfb = 10.0;
        //3.设置一个变量储存银行卡余额
        double bank = 20.0;
        //4.计算总余额
        double total = wx + zfb + bank;
        System.out.println("总余额为:" + total + "元");
        //5.微信收了10元红包，又发了2元红包，余额多少?
        wx += 10;
        wx -= 2;
        System.out.println("微信余额为:" + wx + "元");
    }
}
