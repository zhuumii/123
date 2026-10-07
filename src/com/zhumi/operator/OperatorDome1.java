package com.zhumi.operator;

public class OperatorDome1 {
    public static void main(String[] args) {
       //整数和小数的算术运算符 + - * / %
        // #1.整数运算
        int a = 10;
        int b = 3;
        //细节:整数运算还是整数,就是商
        System.out.println(a + b);//13
        System.out.println(a - b);//7
        System.out.println(a * b);//30
        System.out.println(a / b);//3
        System.out.println(a % b);//1

        System.out.println("-------------------------");

        //#2.小数运算
        double c = 1.1;
        double d = 1.01;
        //细节:小数参与运算的时候可能不精确
        System.out.println(c + d);//2.11 但运行为2.11000000000000004
        System.out.println(c - d);//0.09 但运行为0.09000000000000001
        System.out.println(c * d);//1.1010000000000001
        System.out.println(c / d);//1.0909090909090908
        System.out.println(c % d);//0.09

    }
}
