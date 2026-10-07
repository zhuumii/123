package com.zhumi.variable;

public class VariableDome3 {
    public static void main(String[] args) {
        //定义8种数据类型的变量:
        //>整数类型:byte、short、int、long
        //>浮点数类型:float、double
        //>字符类型:char
        //>布尔类型:boolean

        //变量的定义格式:
        //数据类型 变量名 = 变量值;

        //1.定义byte类型的变量
        byte b = 10;
        System.out.println(b);
        //2.定义short类型的变量
        short s = 32767;
        System.out.println(s);
        //3.定义int类型的变量
        int i = 200;
        System.out.println(i);
        //4.定义long类型的变量
        //细节:long类型的变量值末尾加L或l
        //L大写小写都可以,但是一般写成大写,小写字母l易与数字1混淆
        long l = 1000000000000000000L;
        System.out.println(l);
        //5.定义float类型的变量
        //细节:float类型的变量值末尾加F或f
        //F大写小写都可以,但是一般写成大写,与上面的long统一
        float f = 3.14F;
        System.out.println(f);
        //6.定义double类型的变量
        double d = 3.141592653589793;
        System.out.println(d);
        //7.定义char类型的变量
        char c = 'A';
        System.out.println(c);
        //8.定义boolean类型的变量
        boolean bool = false;
        System.out.println(bool);
    }
}













