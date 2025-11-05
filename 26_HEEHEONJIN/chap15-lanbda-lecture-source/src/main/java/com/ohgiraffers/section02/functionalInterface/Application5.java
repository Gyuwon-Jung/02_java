package com.ohgiraffers.section02.functionalInterface;

import java.util.Arrays;
import java.util.function.Predicate;

public class Application5 {
    public static void main(String[] args) {
        Predicate<Object> predicate = value -> value instanceof String;
        System.out.println("문자열인지 확인 : " + predicate.test("123"));
        System.out.println("문자열인지 확인 : " + predicate.test(123));
        // Arrays.asList().stream().filter(predicate).forEach(System.out::println);
    }
}
