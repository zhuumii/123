package com.zhumi.operator;

import java.util.Scanner;

public class OperatorDome2 {
    public static void main(String[] args) {
        //需求:键盘录入一个三位数,将其拆分为个位,十位,百位后,打印在控制台
        //tips: alt + 回车 自动修改错误
        //      alt + p 强制让ai自动生成代码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int num = sc.nextInt();

        int ge = num / 1 % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        //公式总结:
        //  个位: num / 1 % 10
        //  十位: num / 10 % 10
        //  百位: num / 100 % 10
        //  千位: num / 1000 % 10
        //  万位: num / 10000 % 10
        //  亿位: num / 100000000 % 10
        //  万亿位: num / 1000000000000 % 10
        //  ...以此类推
        System.out.println("个位是:" + ge);
        System.out.println("十位是:" + shi);
        System.out.println("百位是:" + bai);
    }
}
