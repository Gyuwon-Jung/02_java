package com.ohgiraffers.section03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {
        // 1,2,3,4,5,6,7,8,9
        IntStream count = IntStream.range(1, 10); //9
        System.out.println("count = " + count);
        long sum = IntStream.range(1,10).sum();
        System.out.println("sum = " + sum);

        OptionalInt max = IntStream.range(1, 10).max();
        System.out.println("max = " + max);
        OptionalInt min = IntStream.range(1, 10).min();
        System.out.println("min = " + min);

        int oodSum = IntStream.range(1, 10).filter(i -> i % 2 == 1).sum();
        System.out.println("oodSum = " + oodSum);




    }
}
