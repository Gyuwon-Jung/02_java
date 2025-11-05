package com.swcamp.section02.uses.subsection02.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application3 {

    public static void main(String[] args) {

        /*
        스트림의 중계연산 중 하나인 flatMap에 대해 이해하고 사용할 수 있다.
        Stream<R> flatMap(Functoin<? super T, ? extends Stream<? extends R>> mapper);
        flatMap : 중첩 구조를 한 단계 제거하고 단일 컬렉션으로 만들어준다.
        이러한 작업을 플래트닝(flattening)이라고 한다.
         */

        List<List<String>> list = Arrays.asList(
                Arrays.asList("JAVA", "SPRING", "SPRINGBOOT"),
                Arrays.asList("java", "spring", "spring-boot")
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
                .flatMap(st -> Arrays.stream(st.split(" ")))
                .toList();
        System.out.println("words = " + words);
//        words.add("addthing");  >>> words는 불변객체라 추가가 되지 않음.
        /*
        Unmodifiable List (수정 불가 읽기 전용 리스트 - 불변성 보장)
         */
        List<String> unmodifiableList = Collections.unmodifiableList(flatList);
        System.out.println("unmodifiableList = " + unmodifiableList);
//        unmodifiableList.add("test");
        List<String> unmodifiableList2 = List.of("A", "B", "C");
//        unmodifiableList2.add("D");
        List<String> unmodifiableList3 = Stream.of("A", "B", "C").toList();
//        unmodifiableList3.add("D");
    }
}
