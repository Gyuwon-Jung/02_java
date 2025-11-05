package com.ohgiraffers.stream;

import java.util.List;
import java.util.stream.Collectors;

public class PrintName {

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve", "Franklin");

        List<String> exam1 = names.stream()
                .filter(name -> name.length() >= 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(exam1);
    }
}
