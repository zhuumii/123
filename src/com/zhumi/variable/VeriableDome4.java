package com.zhumi.variable;

public class VeriableDome4 {
    public static void main(String[] args) {
        //BMI = 体重(kg) / 身高(m)的平方

        //1.定义一个变量记录体重
        double weight = 65;
        //2.定义一个变量记录身高
        double height = 1.75;
        //3.计算BMI
        double bmi = weight / (height * height);
        //4.输出结果
        System.out.println(bmi);

        //扩展:
        //计算出当前升高,在标准BMI下,最多是多少千克?
        double maxWeight = height * height * 23.9;
        System.out.println("当前身高下,最多可以是多少千克:" + maxWeight);

    }
}