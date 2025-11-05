package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        // Scanner 사용시 유의사항
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 : ");
        int n = sc.nextInt();
        System.out.println("n : " + n );

        sc.nextLine(); // nextInt()가 읽지 않은...

        System.out.println("문자열 입력 : ");
        String str = sc.nextLine();
        System.out.println("str" + str);

    }
}
