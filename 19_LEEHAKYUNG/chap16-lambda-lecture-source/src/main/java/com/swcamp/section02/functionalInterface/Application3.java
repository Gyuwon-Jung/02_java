package com.swcamp.section02.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Application3 {

    public static void main(String[] args) {

        /*
        1. Function<T, R>#apply(T t):R ==> 객체 T를 R로 매핑한다.
         */
        Function<String, Integer> func = (str)
                -> Integer.parseInt(str);
        System.out.println(func.apply("12345678") + " is type of " + func.apply("12345678").getClass().getName());

        /*
        2. BiFunction<T,U,R>#apply(T t, U u):R ==> 객체 T와 U를 R로 매핑한다.
         */
        BiFunction<String, String, Integer> biFunc
                = (str1, str2) -> Integer.parseInt(str1) + Integer.parseInt(str2);
        System.out.println(biFunc.apply("123", "456"));


    }
}
