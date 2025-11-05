package com.ohgiraffers.section03.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {
        /*
        * collect()는 Collector타입을 받아서 처리하는데, 해당 메소드를 통해
        * 컬렉션을 출력으로 받을 수 있다.
        * collect()
        * */
        List<Member> memberList = Arrays.asList(
                new Member("test01", "홍길동"),
                new Member("test02", "유관순"),
                new Member("test03", "신사임당"),
                new Member("test04", "산사")
        );

        System.out.println("memberList = " + memberList);

        // 위의 memberList에서 name만 뽑아서 새로운 리스트객체를 생성해주세요.
//        List<String> stringList = new ArrayList();
//        for (Member member : memberList) {
//            stringList.add(member.getName());
//        }
//        System.out.println("stringList = " + stringList);
        List<String> collectionList = memberList.stream()
                .map(Member::getName)// :: 메소드 참조
//                .collect(Collectors.toList()); // 불변객체 x
        .toList(); // 불변객체
//        collectionList.add("test");
        System.out.println("collectionList = " + collectionList);

        String str = memberList.stream().map(Member::getName).collect(Collectors.joining());
        System.out.println("str = " + str);

        String str2 = memberList.stream()
                .map(Member::getName)
                .collect(Collectors.joining(",", "!", "?" ));
        System.out.println("str2 = " + str2);
    }
}
