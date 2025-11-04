package com.ohgiraffers.section01.intro;

public class Application2 {

    public static void main(String[] args) {

        OuterInterface.Sum sum = (x, y) -> x + y;
        OuterInterface.Minus minus = (x, y) -> x - y;
        OuterInterface.Multiple multiply = (x, y) -> x * y;
        OuterInterface.Devide devide = (x, y) -> x / y;

        System.out.println(sum.sumToNumbers(10, 20));
        System.out.println(minus.minusToNumbers(10, 20));
        System.out.println(multiply.multipleToNumbers(10, 20));
        System.out.println(devide.devideToNumbers(10, 20));
    }
}
