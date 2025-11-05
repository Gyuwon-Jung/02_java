package com.swcamp.section01.intro;

public class Application2 {

    public static void main(String[] args) {

        OuterInterface.Sum sum = (int x, int y) -> x + y;
        OuterInterface.Minus minus = (int x, int y) -> x - y;
        OuterInterface.Multiply multiply = (int x, int y) -> x * y;
        OuterInterface.Divide divide = (int x, int y) -> x / y;

        System.out.println(sum.sumTwoNumbers(10, 20));
        System.out.println(minus.minusTwoNumbers(10, 20));
        System.out.println(multiply.multiplyTwoNumbers(10, 20));
        System.out.println(divide.divideTwoNumbers(10, 20));
    }
}
