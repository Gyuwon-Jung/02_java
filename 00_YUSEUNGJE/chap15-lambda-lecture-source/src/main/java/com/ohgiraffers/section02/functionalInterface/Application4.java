package com.ohgiraffers.section02.functionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application4 {

    public static void main(String[] args) {

        /* BinaryOperator<T>#apply(T t1, T t2):T ==> T와 T를 연산하여 T를 리턴한다.
        * BiFunction을 상속받아 구현했기 때문에 동일하게 apply를 사용할 수 있다.
        * */
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("hello", "world"));

        /* UnaryOperator<T>#apply(T t):T ==> T를 연산하여 T를 리턴한다. */
        UnaryOperator<String> unaryOperator = (str) -> str + "world";
        System.out.println(unaryOperator.apply("hell"));

    }
}
