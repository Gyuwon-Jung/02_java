package com.ohgiraffers.section02.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Application3 {
    public static void main(String[] args) {
        /* 1. Function<T, R>#apply(T t):R ==> 객체 T를 R로 매핑한다*/
        Function<String, Integer> functionon = (String str) -> Integer.parseInt(str);
        String strValue = "12345";
        System.out.println(functionon.apply(strValue));
        System.out.println(functionon.apply(strValue) + " : " + functionon.apply(strValue).getClass().getName());

        /* 2. BiFunction<T,U,R>#apply(T t, U u):R ==> 객체 T와 U를 R로 매핑한다*/
        BiFunction<String, String, Integer> biFunction = (str, str2) -> Integer.parseInt(str) + Integer.parseInt(str2);
        String str1 = "12345";
        String str2 = "67890";
        System.out.println(biFunction.apply(str1, str2) + " : " + biFunction.apply(str1, str2).getClass().getName());
    }
}
