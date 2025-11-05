package com.swcamp.section03.reference;

import java.util.function.Function;

public class Application2 {

    public static void main(String[] args) {

        // 생성자 메서드 참조를 이해하고 사용
        Function<String, Member> function1 = Member::new;
        Member mem1 = function1.apply("user01");
        Function<String, Member> function2 = Member::new;
        Member mem2 = function2.apply("user02");
        System.out.println(mem1.toString());
        System.out.println(mem2.toString());
    }
}
