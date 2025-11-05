package com.sekong.section02.functionalInterface;

import java.time.LocalDateTime;
import java.util.function.*;

public class Application2 {
    public static void main(String[] args) {
        /*
        * Supplier<T>#get():T ==> 객체 T를 리턴한다.*/
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());

        /* BooleanSupplier#getAsBoolean():boolean ==> boolean값을 리턴한다. */
        BooleanSupplier booleanSupplier = () -> {
            int random = (int) (Math.random() * 2);
            return random == 0? false : true;
        };
        System.out.println(booleanSupplier.getAsBoolean());

        /* IntSupplier#getAsInt():int ==> int값을 리턴한다. */
        IntSupplier intSupplier = () -> (int)(Math.random() * 6)+1;
        System.out.println("주사위를 던져서 나온 수 "+intSupplier.getAsInt());

        /* LongSupplier#getAsInt():int ==> long값을 리턴한다. */
        LongSupplier longSupplier = () -> new java.util.Date().getTime();
        System.out.println("1970.01.01 00.00.00 이후 지난 시간 :"+longSupplier.getAsLong());

        /* DoubleSupplier#getAsInt():int ==> Double값을 리턴한다. */
        DoubleSupplier doubleSupplier = () -> Math.random();
        System.out.println("Math.random() : "+doubleSupplier.getAsDouble());
    }
}
