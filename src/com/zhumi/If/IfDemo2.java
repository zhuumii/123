package com.zhumi.If;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        //需求:很多App都有不同的优惠券假设，现在有以下优惠券
        // 全场商品满10减8
        // 全场商品满50减30
        // 全场商品满100减50
        // 全场商品满200减90
        // 会员卡:全场8折
        // 请问:会员卡和优惠券不能同时使用，最优惠的价格是多少?

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入总消费金额:");
        double total = scanner.nextDouble();
        double discount = 0;
        if(total > 0 )
        {
            if(total < 10) discount = 0;
            else if(total < 50) discount = 8;
            else if(total < 100) discount = 30;
            else if(total < 200) discount = 50;
            else discount = 90;
        }else{
            System.out.println("商品价格异常");
        }

        double memberdiscount = total * 0.2;
        if(discount > memberdiscount)
            System.out.println("使用优惠券更优惠，优惠金额为:"+discount);
        else
            System.out.println("使用会员卡更优惠，优惠金额为:"+memberdiscount);
    }
}
