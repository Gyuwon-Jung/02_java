package com.swcamp.section03.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application3 {

    public static void main(String[] args) {
        /*
        스트림의 최종 연산 중 하나인 collect에 대해 이해하고 사용할 수 있다.
         */

        /*
        collect()는 Collector타입을 받아서 처리하는데, 해당 메소드를 통해 컬렉션을 출력으로 받을 수 있다.
        Collect()메소드는 Collector 객체에서 제공하는 정적 메소드를 사용할 수 있다.
         */
        List<Member> members = Arrays.asList(
                new Member("test01", "홍길동"),
                new Member("test02", "유관순"),
                new Member("test03", "신사임당"),
                new Member("test04", "맹자")
        );
        System.out.println("members = " + members);

        // 위의 members에서 name만 뽑아서 새로운 리스트 객체 생성
//        List<String> names = new ArrayList<>();
//        for (Member member : members) {
//            names.add(member.getName());
//        }
//        System.out.println("names = " + names);

        List<String> collectionNames = members.stream()
                .map(Member::getName)
                .collect(Collectors.toList());
        System.out.println("collectionNames = " + collectionNames);

        // joining : concat과 유사, 다만 합칠때 사이에 뭘 넣을지 지정 가능함
        String str = members.stream().map(Member::getName).collect(Collectors.joining());
        System.out.println("str = " + str);

        String str2 = members.stream()
                .map(Member::getName)
                .collect(Collectors.joining(", ", ">> ", " <<"));
        System.out.println("str2 = " + str2);
    }
}
