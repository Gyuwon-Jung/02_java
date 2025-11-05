package com.ohgiraffers.section02.uses.subsection02.intermiediate;

import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        /* 스트림 중계 연산 중 하나인 map에 대해 이해할 수 있다.
        *
        * 중계 연산은 최종 연산 수행 전까지 여러 번 수행할 수 있으며
        * 먼저 일어난 중계 연산의 결과가 파이프라인을 통해 다음 중계 연산으로 전달된다.
        * Stream<R> map(Function<? super T, ? extends R> mapper);
        * 스트림에 들어있는 데이터를 특정 람다식을 통해 데이터를 가공하고 새로운 스트림에 담아주는 역할을 한다.
        * */
        IntStream intStream = IntStream.range(1, 10);
        // intStream.forEach(System.out::println);
         intStream
                 .filter(i -> ( i % 2) == 0) // 2 4 6 8
                 .map(i -> i * 5)            // 10 20 30 40
                 .forEach(i -> System.out.println(i + " "));
    }
}
