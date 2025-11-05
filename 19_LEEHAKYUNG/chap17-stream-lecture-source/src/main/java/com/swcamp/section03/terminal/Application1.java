package com.swcamp.section03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {

    public static void main(String[] args) {

        long count = IntStream.range(1, 10).count(); // 1 ~ 9
        System.out.println("count = " + count);
        long sum = IntStream.range(1, 10).sum();
        System.out.println("sum = " + sum);

        // OptionalInt : 결과 없음을 나타내는 명확한 요구가 있는 메소드의 반환 형식으로 사용
        OptionalInt max = IntStream.range(1, 10).max();
        System.out.println("max = " + max);
        OptionalInt min = IntStream.range(1, 10).min();
        System.out.println("min = " + min);

        int oddSum = IntStream.range(1, 10).filter(i -> i % 2 == 1).sum();
        System.out.println("oddSum = " + oddSum);

    }
}
