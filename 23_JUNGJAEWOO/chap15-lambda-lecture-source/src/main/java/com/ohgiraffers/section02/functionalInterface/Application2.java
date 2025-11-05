package com.ohgiraffers.section02.functionalInterface;

import java.time.LocalDateTime;
import java.util.function.*;

public class Application2 {
    public static void main(String[] args) {

        /* Supplier<T>#get() : T ==> 객체 T를 리턴한다 */
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());

        /* BooleanSupplier#getAsBoolean() : boolean ==> boolean값을 리턴한다. */
        BooleanSupplier booleanSupplier = () -> {
            int random = (int)(Math.random() * 2);
            return random == 0? false: true;
        };
        System.out.println(booleanSupplier.getAsBoolean());

        /* IntSupplier#getAsInt() : int ==> int값을 리턴 */
        IntSupplier intSupplier = () -> (int)(Math.random() * 6) +1;
        System.out.println(intSupplier.getAsInt());

        /* LongSupplier#getAsLong() : Long ==> Long값을 리턴 */
        LongSupplier longSupplier = () -> new java.util.Date().getTime();
        System.out.println("1970년 1월 1일 0시 0분 0초 이후 지난 시간 : "+longSupplier.getAsLong());
        /* DoubleSupplier#getAsDouble() : double ==> double값을 리턴 */
        DoubleSupplier doubleSupplier = () -> Math.random();
        System.out.println("Math.random()의 리턴값 : " + doubleSupplier.getAsDouble());

    }
}
