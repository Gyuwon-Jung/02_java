package com.sekong.section01.intro;

public class Application2 {
    public static void main(String[] args) {
        OuterInterface.Sum sum = (x,y) -> x+y;
        OuterInterface.Minus minus = (x,y) -> x-y;
        OuterInterface.Multiply multiply = (x,y) -> x*y;
        OuterInterface.Divide divide = (x,y) -> x/y;

        System.out.println(sum.sumToNumber(10,20));
        System.out.println(minus.minusToNumber(10,20));
        System.out.println(multiply.multiplyToNumber(10,20));
        System.out.println(divide.divideToNumber(10,20));
    }
}
