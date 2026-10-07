package com.zhumi.variable;

import java.util.Scanner;

public class VeriableDome6 {
    public static void main(String[] args) {

        //定义两个整数类型的变量num1和num2,键盘录入数据分别为两个变量赋值
        //求两个数的和并打印

        //1.找到Scanner这个打工人
        Scanner sc = new Scanner(System.in);

        //2.让Scanner干活，接收键盘录入的两个整数
        System.out.println("请键盘录入第一个整数:");
        int num1 = sc.nextInt();
        System.out.println(num1);

        System.out.println("请键盘录入第二个整数:");
        int num2 = sc.nextInt();
        System.out.println(num2);
        //3.求两个数的和并打印
        int sum = num1 + num2;
        System.out.println(sum);

    }
}