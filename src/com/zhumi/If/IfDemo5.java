package com.zhumi.If;

import java.util.Scanner;

public class IfDemo5 {
    public static void main(String[] args) {
        //给定一个整数n，请计算其所有数位之和。若n为负数，请先取其绝对值。

        //键盘录入n
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int n = sc.nextInt();
        int sum = 0;
        if (n < 0) {
            n = -n;
        }
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("数位之和为:" + sum);
    }
}