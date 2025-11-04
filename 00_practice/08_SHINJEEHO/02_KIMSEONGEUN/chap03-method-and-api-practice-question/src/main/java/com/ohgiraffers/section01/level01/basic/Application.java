package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.checkMethod();

        int first = 10;
        int second = 20;
        String str1 = calculator.sumTwoNumber(10, 20);
        System.out.println(first + "과 " + second + "의 합은 " + str1 + "입니다.");

        String result2 = calculator.multiTwoNumber(first, second);
        System.out.println(first + "과" + second + " 의 합은 " + result2 + "입니다.");

        int result3 = calculator.multiTwoNumber2(first, second);
        System.out.println(first + "과" + second + " 의 합은 " + result3 + "입니다.");
    }
}
