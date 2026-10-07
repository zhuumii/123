package com.zhumi.operator;

public class OperatorDome5 {

    public static void main(String[] args) {
        short s1 = 100;
        short s2 = 200;
        byte result1 = (byte)(s1 + s2);
        System.out.println(result1);
        //300(int) 二进制为 00000000 00000000 00000001 00101100
        //00000000 00000000 00000001 00101100(int) 强制转换-> 00101100(byte) ->44
        int result2 = s1 + s2;
        System.out.println(result2);
    }
}
