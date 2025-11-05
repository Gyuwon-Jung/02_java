package com.ohgiraffers.section03.references;

import java.util.function.Function;

public class Application2 {
    public static void main(String[] args) {
        Function<String, Member> function = Member::new;
        Member member1 = function.apply("user01");
        Member member2 = function.apply("user02");
        System.out.println(member1);
        System.out.println(member2);
    }
}
