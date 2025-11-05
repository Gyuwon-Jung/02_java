package com.ohgiraffers.section01.level01.basic;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Calculator.checkMethod();
        Calculator.sumTwoNumber(10, 20);
        Calculator.multiTwoNumber(10, 20);


        //String result = 10 + "과 " + 20 + "의 곱은 " + Calculator.multiTwoNumber2(10, 20) + "입니다.";
        int num1 = 10;
        int num2 = 20;
        int result2 = Calculator.multiTwoNumber2(num1, num2);
        System.out.println(num1 + "과 " + num2 + "의 곱은 " + result2 + "입니다.");
        //System.out.println(result2);
    }
}
