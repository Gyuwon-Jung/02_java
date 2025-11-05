package com.ohgiraffers.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PeekCharactor {

    public static void main(String[] args) {

        List<String> texts = Arrays.asList("I love Java", null, "java is fun", "Python", null);

        List<String> exam3 = texts.stream()
                .filter(Objects::nonNull)
                .map(String::toLowerCase)
                .filter(t -> t.contains("java"))
                .toList();

        exam3.forEach(System.out::println);
    }
}
