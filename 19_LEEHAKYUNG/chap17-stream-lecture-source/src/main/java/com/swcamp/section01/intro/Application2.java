package com.swcamp.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {

    public static void main(String[] args) {

        /* 스트림의 병렬 처리에 대해 이해할 수 있다. */
        List<String> list = new ArrayList<>(
                Arrays.asList("java", "mariadb", "html", "css", "mybaits")
        );
        // 모든 작업은 기본적으로 main 스레드에서 일어난다.
        System.out.println("for each ========================");
        for (String str : list) {
            print(str);
        }

        System.out.println("normal stream ========================");
        list.stream().forEach(Application2::print);

        /*
        병렬 스트림을 활용하면 처리해야할 데이터 요소가 많을 경우
        효율적으로 처리할 수 있는 장점이 있다.
         */
        System.out.println("parallel stream ========================");
        list.parallelStream().forEach(Application2::print);
        list.parallelStream().forEach(Application2::print);
    }

    private static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
