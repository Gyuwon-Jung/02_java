package com.swcamp.section03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application2 {

    public static void main(String[] args) {
        /*
         * reduce
         * Optional<T> reduce(BinaryOperator<T> accumulator);
         * T reduce(T identity, BinaryOperator<T> accumulator);
         * U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner);
         * reduce()라는 메소드는 스트림에 있는 데이터들의 총합을 계산해준다.
         * */
        // 인자가 1개일 경우
        OptionalInt reduceOneParam =
                IntStream.range(1, 10).reduce((a, b) -> Integer.sum(a, b));
        System.out.println("reduceOneParam = " + reduceOneParam);

        // 인자가 2개일 경우
        int reduceTwoParam = IntStream.range(1, 10).reduce(100, Integer::sum);
        System.out.println("reduceTwoParam = " + reduceTwoParam);

        // 인자가 3개일 경우
        Integer reduceThreeparam = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .reduce(100, Integer::sum, (x, y) -> x + y);
        System.out.println("reduceThreeparam = " + reduceThreeparam);
        Integer reduceThreeparam2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .parallel()
                .reduce(100, Integer::sum, (x, y) -> x + y);
                // reduce연산이 병렬적으로 stream인자에 대해 모두 행해짐. 즉 100이 10개의 인자(1~10)에 대해 더해짐
        System.out.println("reduceThreeparam2 = " + reduceThreeparam2);
    }
}
