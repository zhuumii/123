package com.zhumi.If;

import java.util.Scanner;

public class IfDome1 {
    public static void main(String[] args) {

//        卡拉兹函数(Collatzfunction)定义如下:
//        给定正整数n，
//        若n为奇数，则f(n)=3n+1
//        若n为偶数，则f(n)=n/2
//        示例1:
//        输入:1
//        说明:奇数，3*1+1=4
//        输出:4
//        示例2:
//        输入:2
//        说明:偶数，2*/2=1
//        输出:1
//
        //键盘输入n
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int n = scanner.nextInt();
        //判断n的奇偶
        if (n % 2 == 0) {
            int result = n / 2;
            System.out.println(result);
        } else {
            int result = 3 * n + 1;
            System.out.println(result);
        }

    }
}


