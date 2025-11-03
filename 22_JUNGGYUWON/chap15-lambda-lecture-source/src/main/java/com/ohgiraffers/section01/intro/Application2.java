package com.ohgiraffers.section01.intro;

import java.net.SocketTimeoutException;

public class Application2 {
    public static void main(String[] args) {

        OuterInterface.Sum sum = (int x, int y) -> x+y;
        OuterInterface.Minus minus = (int x, int y) -> x-y;
        OuterInterface.Multiple multiply = (int x, int y) -> x*y;
        OuterInterface.Devide devide = (int x, int y) -> x*y;

        System.out.println(sum.sumToNumbers(10,20));
        System.out.println(minus.minusToNumbers(10,20));
        System.out.println(multiply.multipleToNumbers(10,20));
        System.out.println(devide.devideToNumbers(10,20));
    }
}
