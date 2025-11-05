package com.ohgiraffers.section02.functionalInterface;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.*;

import java.lang.Math.*;

public class Application2 {
    public static void main(String[] args) {
        /*Supplier<T>#get():T ==> 객체 T를 리턴합니다.*/
        Supplier<LocalDateTime> supplier = LocalDateTime::now;
        System.out.println(supplier.get());

        /*BooleanSupplier#getAsBoolean():boolean ==> boolean 값을 리턴한다.*/
        BooleanSupplier booleanSupplier = () -> {
            int random = (int) (Math.random() * 2);
            return random == 0? false : true;
        };
        System.out.println(booleanSupplier.getAsBoolean());

        /*IntSupplier#getAsInt():int ==> int 값을 리턴한다.*/
        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println("주사위를 던져서 나온 수 : " + intSupplier.getAsInt());

//        /*LongSuppLier#getAsInt():int ==> Long값을 리턴한다. */
//        LongSupplier LongSupplier = () -> java.Date().getTime();
//        System.out.println("1970년 1월 1일 0시 0분 0초에 이후 지난 시간 : " + LongSupplier.getAsLong());

        /*DoubleSupplier#getAsInt():int ==> double값을 리턴한다.*/
        DoubleSupplier doubleSupplier = () -> Math.random();

    }
}
