package com.ohgiraffers.section03.references;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.lang.*;

public class Application3 {
    public static void main(String[] args) {
        /*
        * Collection과 람다식 함께 사용
        *
        * JDK8에 추가된 default 메소드 iterable:forEach
        * JDK8에 추가된 default 메소드 Collection::removeIf
        * JDK8에 추가된 default 메소드 List::replaceAll
        * */

        test1();

        /*
         * Map
         * JDK8에 추가된 default 메소드 Map:forEach
         * */

        test2();

    }


    private static void test1() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }

/*        for(Integer i : list){
            System.out.println(i);
        }*/
        list.forEach(i -> System.out.print(i + " "));
        System.out.println();
        /* 2의 배수 제거*/
        list.removeIf(i -> i % 2 == 0);
        System.out.println(list);

        /*모든 요소에 10곱하기*/
        list.replaceAll(i -> i * 10);
        System.out.println(list);

        // list.removeIf(i -> i % 2 == 0).replaceAll(i -> i * 10)... 이런건 안 된다.
    }

    private static void test2() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Device");
        map.put(2, "Jack");
        map.put(3, "Peter");
        map.put(4, "Brown");
        map.put(5, "Charis");

        System.out.println("map : " + map);
        System.out.println(map.get(1));
        System.out.println(map.get(11));
        System.out.println(map.getOrDefault(1, "홍길동"));
        System.out.println(map.getOrDefault(11, "홍길동")); // 없는 값이면
        
        /* 해당 key가 존재하지 않을 경우 key - value 생성 */
        map.computeIfAbsent(10,(k->"James"));
        System.out.println("map = " + map);

        /* 해당 key가 존재한다면 수정할 수 있다.*/
        map.computeIfPresent(5,(k,v) -> "Karl");
        System.out.println("map = " + map);

        map.compute(3,(k,v) -> (v == null) ? "Ted" : v + "!!!");
        map.compute(33,(k,v) -> (v == null) ? "Ted" : v + "!!!");
        System.out.println("map = " + map);

        map.replaceAll((k,v) -> v.toUpperCase());
        map.forEach((k,v) -> System.out.println(k + " : " + v));
    }
}
