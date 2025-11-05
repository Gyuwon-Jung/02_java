package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {
        /*배열이나 컬렉션을 이용하여 스트림을 생성하는 방법을 이해하고 사용할 수 있다.*/

        /*배열을 스트림으로 생성하기*/
        String[] sarr = {"java", "maridb", "jdbc"};
        Stream<String> StringStream = Arrays.stream(sarr);
        StringStream.forEach(System.out::println);

//        List<String> list = Arrays.asList("java", "maridb", "jdbc");
//        list.stream().forEach(System.out::println);

        System.out.println("=========================================================");
        Stream<String> stringStream1 = Arrays.stream(sarr, 0, 2);
        stringStream1.forEach(System.out::println);

        System.out.println("=========================================================");
        /* 컬렉션을 스트림으로 생성하기 */
        List<String> stringList = Arrays.asList("html", "css", "javascript");
        Stream<String> stringStream2 = stringList.stream();
        /* 컬렉션에도 forEach기능은 정의되어 있으므로 stream화 하지 않고 사용할 수 있다.  */
        System.out.println("=========================================================");
        stringList.forEach(System.out::println);

        /* Builder를 활용한 스트림 생성 */
        Stream<String> stringStream3 = Stream.<String>builder()
                .add("홍길동")
                .add("유관순")
                .add("윤봉길")
                .build();
        stringStream3.forEach(System.out::println);

        /* iterate()를 활용하여 수열 형태의 스트림을 생성 */
        Stream<Integer> integerStream =
                Stream.iterate(10, value -> value * 2).limit(10);
        integerStream.forEach(System.out::println);
    }
}
