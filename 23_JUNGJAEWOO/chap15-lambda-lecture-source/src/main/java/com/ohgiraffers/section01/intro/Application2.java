package com.ohgiraffers.section01.intro;

public class Application2 {
    public static void main(String[] args) {

        OuterInterface.Sum sum = (x,y) -> x+y;
        OuterInterface.Minus minus = (x,y) -> x-y;
        OuterInterface.Multiple multiplu = (x,y) -> x*y;
        OuterInterface.Divide divide = (x,y) -> x/y;

        System.out.println(sum.sumToNumbers(10, 20));
        System.out.println(minus.minusToNumbers(10, 20));
        System.out.println(multiplu.multipleToNumbers(10, 20));
        System.out.println(divide.divideToNumber(10, 20));
    }
}
