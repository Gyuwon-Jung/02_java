package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application3 {
    public static void main(String[] args) {

        /* 스트림의 중계 연산 중 하나인 flatMap에 대해 이해하고 사용할 수 있다.
        * Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
        * flatMap : 중첩 구조를 한 단계 제거하고 다일 컬렉션으로 만들어준다.
        * 이러한 작업을 플래트닝(flattening)이라고 한다.
        * */
        List<List<String>>  list = Arrays.asList(
                Arrays.asList("JAVA","SPRING", "SPRINGBOOT"),
                Arrays.asList("java","spring","springboot")
        );

        System.out.println("list = " + list);

        List<String> flatList = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println("flatList = " + flatList);

        List<String> sentences = Arrays.asList(
                "Hello World",
                "Java Stream API",
                "flatMap Example"
        );
        System.out.println("sentences = " + sentences);

        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .toList();
        System.out.println("words = " + words);

//        words.add("단어 추가"); // 단어 추가가 되지 않는다
        /* Unmodifiable List (수정 불가 읽기 전용 리스트 - 불변성 보장) */
        List<String> unmodifiableList = Collections.unmodifiableList(flatList);
        System.out.println("unmodifiableList = " + unmodifiableList);
        List<String> unmodifiableList1 = List.of("A", "B", "C");
//        unmodifiableList1.add("D");
        List<String> unmodifiableList2 = Stream.of("A","B","C").toList();
//        unmodifiableList2.add("D");
    }
}
