package com.zhumi.controllerloop;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数表示范围:");
        int n = scanner.nextInt();

        int t = 0;
        boolean x = false;

        for (int i = 1; i <= n; i++) {
            t = i;
            x = false;
            while( t  > 0){
                if( t % 10 == 4) {
                    x = true;
                }
                t /= 10;
            }
            if ( i % 4 == 0 || x ) {
                continue;
            }
            System.out.println(i);
        }
    }
}
