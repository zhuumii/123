package com.zhumi.If;

public class IfDemo4 {
    public static void main(String[] args) {
//        需求:世界最高山峰珠穆朗玛峰高度是:8848.86米=8848860毫米
//        假如我有一张足够大的纸，它的厚度是0.1毫米。
//        请问:该纸张折叠多少次，可以折成珠穆朗玛峰的高度?

        int count = 0; // 折叠次数
        double paperThickness = 0.1; // 纸张厚度
        double mountHeight = 8848860; // 珠穆朗玛峰高度
        while (paperThickness < mountHeight) {
            paperThickness *= 2;
            System.out.println("纸张厚度:" + paperThickness);
            count++;
        }
        System.out.println("需要折叠" + count + "次");
    }
}