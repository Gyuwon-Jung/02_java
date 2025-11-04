package com.ohgiraffers.section02.functionalInterface;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

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

        Runnable runnable = () -> System.out.println("Hello2");
        runnable.run();

        Consumer<String> c = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + "이(가) 입력됨");
            }
        };
        c.accept("Hello world!");

        /* Consumer<T>#accept(T t) : 객체 T를 받아 소비 */
        Consumer<String> consumer = s -> System.out.println(s + "이(가) 입력됨");
        consumer.accept("helloworld");

        /* BiConsumer<T, U>#accept(T t, U u):void ==> 객체 T, U를 받아 소비한다. */
        BiConsumer<String, LocalTime> biConsumer = (str1, time) ->
                System.out.println(str1 + "(이)가 " + time + "이 입력됨");
        biConsumer.accept("홍길동", LocalTime.now());

        /* IntConsumer#accept(int value):void ==> int값을 받아 소비한다. */
        IntConsumer intConsumer = num -> System.out.println("입력하신 정수의 제곱은 "+
                (num * num) + "입니다");
        intConsumer.accept(10);

        /* LongConsumer#accept(long value):void ==> long값을 받아 소비한다. */
        LongConsumer longConsumer = num -> System.out.println("입력하신 정수는 "
                                                    + num + "입니다.");
        longConsumer.accept(12345);

        /* ObjIntConsumer#accept(T t, int value):void ==> 객체 T와 int값을 받아 소비한다. */
        ObjIntConsumer<java.util.Random> objIntConsumer =
                (random, bound) -> System.out.println("0부터 " + bound + "전까지의 난수 발생:"
                        + random.nextInt(bound));
        objIntConsumer.accept(new Random(), 10);

        /* ObjLongConsumer#accept(T t, long value):void ==> 객체 T와 long값을 받아 소비한다.*/
        ObjLongConsumer<LocalDate> objLongConsumer =
                (date, days) -> System.out.println(date + "의 " + days + "일 후의 날짜는"
                        + date.plusDays(days));
        objLongConsumer.accept(LocalDate.now(), 10);

        /* ObjDoulbeConsumer#accept(T t, double value):void ==> 객체 T와 doulbe값을 받아 소비한다.*/
        ObjDoubleConsumer<StringBuilder> objDoubleConsumer =
                (sb, doubleValue)
                        -> System.out.println(sb.append(Math.abs(doubleValue)));
        objDoubleConsumer.accept(new StringBuilder("절대값 : "), -123.5);
    }
}
