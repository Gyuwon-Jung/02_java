package com.ohgiraffers.stream;

import com.ohgiraffers.stream.dto.User;

import java.util.List;
import java.util.stream.Collectors;

public class CheckAge {

    public static void main(String[] args) {

        List<User> users = List.of(
                new User("Alice", 23),
                new User("Bob", 17),
                new User("Charlie", 19),
                new User("David", 25)
        );

        List<String> exam2 = users.stream()
                .filter((u) -> u.getAge() >= 20)
                .map(User::getName)
                .collect(Collectors.toList());
        exam2.forEach(System.out::println);
    }
}
