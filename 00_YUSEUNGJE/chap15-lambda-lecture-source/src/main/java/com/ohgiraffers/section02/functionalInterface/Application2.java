package com.ohgiraffers.section02.functionalInterface;

import java.time.LocalDateTime;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class Application2 {
    public static void main(String[] args) {

        /* Supplier<T>#get():T  ==> 객체 T를 리턴한다. */
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());

        /* BooleanSupplier#getAsBoolean():boolean ==> boolean값을 리턴한다. */
        BooleanSupplier booleanSupplier = () -> {
            int random = (int) (Math.random() * 2);
            return random == 0? false : true;
        };
        System.out.println(booleanSupplier.getAsBoolean());

        /* IntSupplier#getAsInt():int ==> int값을 리턴한다. */
        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println("주사위를 던져서 나온 수 : "+intSupplier.getAsInt());

        /* LongSupplier#getAsInt():int ==> long값을 리턴한다. */
        LongSupplier longSupplier = () -> new java.util.Date().getTime();
        System.out.println("1970년 1월 1일 0시 0분 0초 이후 지난 시간 : " + longSupplier.getAsLong());

        /* DoubleSupplier#getAsInt():int ==> double값을 리턴한다. */
        DoubleSupplier doubleSupplier = () -> Math.random();
        System.out.println("Math.random()의 리턴값: "+ doubleSupplier.getAsDouble());
    }
}
