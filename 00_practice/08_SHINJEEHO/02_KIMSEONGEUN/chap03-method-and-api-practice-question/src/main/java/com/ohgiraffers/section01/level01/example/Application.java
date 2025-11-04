package com.ohgiraffers.section01.level01.example;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ExampleTest exampleTest = new ExampleTest();
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        exampleTest.evenOdd(num);

        System.out.print("첫번 째 숫자 입력 : ");
        int first = sc.nextInt();
        System.out.print("두번 째 숫자 입력 : ");
        int second = sc.nextInt();
        exampleTest.findMax(first, second);

        exampleTest.randomMathQuiz();

        sc.close();
    }
}
