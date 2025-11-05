package com.ohgiraffers.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FilterAndJoinStrings {

    public static void main(String[] args) {

        List<String> words = List.of("hi", "hello", "to", "world", "java");
        String exam4 = words.stream()
                .filter(w -> w.length() >= 3)
                .collect(Collectors.joining(", "));
        System.out.println(exam4);
    }
}
