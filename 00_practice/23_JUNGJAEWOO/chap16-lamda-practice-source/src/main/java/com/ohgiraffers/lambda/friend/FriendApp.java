package com.ohgiraffers.lambda.friend;

import java.util.*;
import java.util.stream.Stream;

public class FriendApp {
    public static void main(String[] args) {
        // 1. 다음 리스트를 순회하면서 40세 이상만 출력하세요. (list의 forEach메소드 사
//        용할 것.)
        List<Friend> list = List.of(
                new Friend("홍길동", 30),
                new Friend("신사임당", 48),
                new Friend("전봉준", 35),
                new Friend("세종대왕", 54),
                new Friend("간달프", 105)
        );
        Stream<Friend> stream = list.stream();
        stream.filter(f -> f.getAge() >= 40).forEach(System.out::println);

// 2. 다음 map에서 key값이 홀수인 value만 출력하세요. (map의 forEach메소드 사용
//        할 것.)
        Map<Integer, Friend> map = Map.of(
                1, new Friend("홍길동", 30),
                2, new Friend("신사임당", 48),
                3, new Friend("전봉준", 35),
                4, new Friend("세종대왕", 54),
                5, new Friend("간달프", 105)
        );
        map.forEach((k, v) -> {
            if (k % 2 == 1) {
                System.out.println(v);
            }
        });
    }
}
//[수행결과]
//Person [name=신사임당, age=48]
//Person [name=세종대왕, age=54]
//Person [name=간달프, age=105]
//Person [name=홍길동, age=30]
//Person [name=전봉준, age=35]
//Person [name=간달프, age=105]

