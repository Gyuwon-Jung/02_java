package com.swcamp.section02.functionalInterface;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Application1 {

    public static void main(String[] args) {

        /* JDK 8에서 빈번하게 사용되는 함수적 인터페이스를 표준 API로 제공하고 있다.
         *  Consumer : 리턴값이 없는 accept() 메소드를 가지고 있다.
         *  Supplier : 매개변수가 없고 리턴 값이 있는 getXXX() 메소드를 가지고 있다.
         *  Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다. (매개변수를 리턴값으로 매핑하는 역할)
         *  Operator : Function과 똑같이 applyXXX() 메소드를 가지고 있다. 차이점은 매개변수로 연산을 한 후 통일타입으로 리턴한다.
         *  Predicate : 매개변수와 boolean 값을 반환하는 testXXX()를 가지고 있다. (매개변수를 활용하여 boolean 반환)
         * */
        // 매개변수 없고, 리턴값도 없는 람다
        Runnable r = new Runnable() {

            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        r.run();

        Runnable r2 = () -> System.out.println("World");
        r2.run();

        Consumer<String> c = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + "이(가) 입력됨");
            }
        };
        c.accept("Hello");

        // Consumer<T>#accept(T t) : 객체 T를 받아서 소비하는 역할
        Consumer<Integer> c2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i + " 더하기 30은 " + (i + 30) + "입니다.");
            }
        };
        c2.accept(15);

        Consumer<String> c3 = s -> System.out.println(s + " 가 입력됨...");
        c3.accept("Hello");

        // BiConsumer<T, U>#accept(T t, U u):void ==> 객체 T, U를 받아 소비한다.
        BiConsumer<String, LocalTime> biConsumer = (str1, time1) ->
                System.out.println(str1 + "이(가) " + time1 + "에 입력됨");
        biConsumer.accept("Hello", LocalTime.now());

        // IntConsumer#accept(int value) : void ==> int값을 받아 소비한다.
        IntConsumer intConsumer = num -> System.out.println("입력하신 정수의 제곱은 " + (num*num) + "입니다.");
        intConsumer.accept(10);

        // LongConsumer#accept(long value) : void ==> long값을 받아 소비한다.
        LongConsumer longConsumer = lnum -> System.out.println("입력한 정수의 세제곱은 "
                                                + (lnum*lnum*lnum) + "입니다.");
        longConsumer.accept(18L);

        // ObjIntConsumer#accept(T t, int value) void ==> 객체 t와 int값을 받아 소비한다.
        ObjIntConsumer<Random> objIntConsumer = (random, bound)
                -> System.out.println(random.nextInt(bound));
        objIntConsumer.accept(new Random(), 10);

        // ObjLongConsumer#accept(T t, long value):void ==> 객체 t와 long값을 받아 소비한다.
        ObjLongConsumer<LocalDate> objLongConsumer = (date, days) ->
                System.out.println(date + "의 " + days + "일 후의 날짜는 " + date.plusDays(days));
        objLongConsumer.accept(LocalDate.now(), 10);

        // ObjDoubleConsumer#accept(T t, double value):void ==> 객체 t와 double값을 받아 소비한다.
        ObjDoubleConsumer<StringBuilder> objDoubleConsumer = (sb, doubleValue) ->
                System.out.println(sb.append(Math.abs(doubleValue)));
        objDoubleConsumer.accept(new StringBuilder(), -123.4);

    }
}
