package com.sekong.section02.functionalInterface;

import java.util.function.Predicate;

public class Application5 {
    public static void main(String[] args) {

        Predicate<Object> predicate = value -> value instanceof String;
        System.out.println("문자열인지 확인 : "+ predicate.test("123"));
        System.out.println("문자열인지 확인 : "+ predicate.test(123));

    }
}
