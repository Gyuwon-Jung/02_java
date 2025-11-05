package com.ohgiraffers.section03.refences;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Application1 {
    public static void main(String[] args) {


        /*
         * [메소드 참조 표현식]
         * 클래스이름::메소드이름
         * 참조변수이름::메소드이름
         * */
        BiFunction<String, String, Boolean> biFunction;

        String str1 = "METHOD";
        String str2 = "METHOD";

        /* 람다식 사용 버전 */
        biFunction = (x, y) -> x.equals(y);
        boolean result = biFunction.apply(str1, str2);
        System.out.println("result : " + result);

        /* 메소드 참조 버전 */
        biFunction = String::equals;
        result = biFunction.apply(str1, str2);
        System.out.println("result : " + result);

        Predicate<String> isEqualsToSample;
        String sample = "hello world";

        /* 람다식 버전 */
        isEqualsToSample = (s) -> s.equals(sample);
        result = isEqualsToSample.test("Hello world");
        System.out.println("result : " + result);

        /* 메소드 참조 버전 */
        isEqualsToSample = sample::equals;
        result = isEqualsToSample.test("Hello world");
        System.out.println("result : " + result);

        Consumer<Object> objectrConsumer = System.out::println;
        objectrConsumer.accept("나오니?");

        List<String> subjects = new ArrayList<>();
        subjects.add("Java");
        subjects.add("Spring");
        subjects.add("Hibernate");
        subjects.add("JPA");

        forEach(subjects, System.out::println);
    }

    private static void forEach(List<? extends Object> list, Consumer<Object> consumer) {
        for(Object obj : list) {
            consumer.accept(obj);
        }
    }
}
