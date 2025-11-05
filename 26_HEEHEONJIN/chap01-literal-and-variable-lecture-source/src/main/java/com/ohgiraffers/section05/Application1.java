package com.ohgiraffers.section05;

public class Application1 {
    public static void main(String[] args) {
        // 정수 : byte < short < int* < long
        // 실수 : float < double
        // 문자 : char
        // 논리 : boolean
        byte bNum = 1;
        short sNum = bNum;
        int iNum = bNum;

        int num1 = 10;
        long num2 = 20L;

        long result1 = num2;
        System.out.println("result1 = " + result1);

        int ch1 = 'a';
        System.out.println("ch1 = " + ch1);

        char ch2 = 65;
        System.out.println("ch2 = " + ch2);

    }
}
