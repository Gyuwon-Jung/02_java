package com.ohgiraffers.section03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 8 9
        long count = IntStream.range(1,10).count(); // 9개
        System.out.println("count = " + count);
        long sum = IntStream.range(1,10).sum();
        System.out.println("sum = " + sum);

        /*OptionalInt : 결과 없음을 나타내는 명확한 요구가 이쓴ㄴ 메소드의 반환 형식으로 */
        OptionalInt max = IntStream.range(1,10).max(); //Null 일 수도 있다. String 제외하고느 Null 안 되기때문에 opeitonal 필요
        System.out.println("max = " + max);

        OptionalInt min = IntStream.range(1,10).min(); //Null 일 수도 있다. String 제외하고느 Null 안 되기때문에 opeitonal 필요
        System.out.println("max = " + min);

        int oddSum = IntStream.range(1,10).filter(i -> i % 2 == 1).sum();
        System.out.println("oddSum = " + oddSum);


    }
}
