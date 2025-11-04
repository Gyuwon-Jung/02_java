package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {

    public static void main(String[] args) {

        /* 기본 자료형 스트림 생성에 대해 이해하고 사용할 수 있다. */
        IntStream intStream = IntStream.range(5, 10);
        intStream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        LongStream longStream = LongStream.rangeClosed(5, 10);
        longStream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        /* Wrapper클래스 자료형의 스트림으로 변환이 필요한 경우 boxing할 수 있다.*/
        Stream<Double> doubleStream = new Random().doubles(5).boxed();
        doubleStream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        /* 문자열을 IntStream으로 변환할 수 있다. */
        IntStream helloworldChars = "hello world".chars();
        helloworldChars.forEach(i -> System.out.print(i + " "));
        System.out.println();

        /* 문자열을 split해서 Stream으로 생성할 수 있다. */
        Stream<String> splitStream =
                Pattern.compile(", ")
                        .splitAsStream("html, css, javascript");
        splitStream.forEach(i -> System.out.print(i + " !"));
        System.out.println();

        /* stream.of() */
        Stream<String> stringStream1 = Stream.of("Hello", "World");
        Stream<String> stringStream2 = Stream.of("java", "World");
//        stringStream1.forEach(i -> System.out.print(i + " "));
        System.out.println();
//        stringStream2.forEach(i -> System.out.print(i + " "));
        /*
        * 스트림은 1회용으로만 사용할 수 있다. 최종 연산(ex. forEach)등이 수행된 스트림은
        * 재사용할 수 없다. 재사용하면 java.lang.IllegalStateException이 발생한다.
        * */
//        stringStream2.forEach(i -> System.out.print(i + " "));
        /* concat()을 통해 스트림 합치기 */
        Stream<String> concatStream = Stream.concat(stringStream1, stringStream2);
        concatStream.forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}
