package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    public void testSimpleIfStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 하나 입력: ");
        int num = sc.nextInt();

        if(num%2== 0) {
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }

    public void testNestedIfStatement(){
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 하나 입력 : ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("입력하신 숫자는 짝수 입니다.");
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
