package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Application1 {

    public static void main(String[] args) {

        /* Stream에 대해 이해하고 사용할 수 있다. */
        List<String> list = new ArrayList<>(
                Arrays.asList("hello", "stream", "world")
        );

        /* 특정 요소를 찾기 위해 iterator or foreac 등을 활용할 수 있다. */
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("stream")) {
                System.out.println(next);
            }
        }
        System.out.println("====== stream 시작 ========");
        /* 위의 동작을 stream을 활용하여 수행할 수 있다. */
//        list.stream().forEach(System.out::println);
//        list.stream().forEach(str -> System.out.println("걸러진 값: " + str));
        list.stream().filter("stream"::equals).forEach(str -> System.out.println("걸러진 값: " + str));
    }
}
