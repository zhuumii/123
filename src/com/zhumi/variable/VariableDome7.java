package com.zhumi.variable;

import java.util.Scanner;

public class VariableDome7 {
    public static void main(String[] args) {
        // BMI = 体重(kg) / 身高(m)的平方

        // 1. 键盘录入记录体重和身高
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入体重(kg):");
        double weight = scanner.nextDouble();

        System.out.println("请输入身高(m):");
        double height = scanner.nextDouble();

        // 2. 计算BMI
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);


    }
}
