package com.zhumi.If;

import java.util.Scanner;

public class IfDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入充值金额:");
        int price = scanner.nextInt();
        int total = 0;
        if(price > 0) {
            if(price < 1000) total = price;
            else if(price < 2000) total = price + 200;
            else if(price < 3000) total = price + 500;
            else if(price < 5000) total = price + 700;
            else if(price < 10000) total = price + 1300;
            else if(price < 20000) total = price + 2500;
            else if(price < 50000) total = price + 6000;
            else total = price + 15000;
            System.out.println("充值金额为:"+price+"元，充值后总金额为:"+total+"元");
        }else
            System.out.println("充值金额异常");


    }
}


