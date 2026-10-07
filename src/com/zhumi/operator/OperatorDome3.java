package com.zhumi.operator;

public class OperatorDome3 {
    public static void main(String[] args) {
        //1.定义变量记录总秒数
        int seconds = 72899;
        //2.计算小时数
        int hour = seconds / 3600;
        System.out.println(hour);
        //3.计算分钟数
        int minute = seconds % 3600 / 60;
        System.out.println(minute);
        //4.计算剩余秒数
        int Second = seconds %3600 % 60;
        System.out.println(Second);
        //x小时xx分钟xx秒
        System.out.println(hour + "小时" + minute + "分钟" + Second + "秒");
    }
}

