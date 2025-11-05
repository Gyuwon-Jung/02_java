package com.ohgiraffers.section02.pakage_and_import.test;

public class Calculator {
    public static int plusTwoNumbers(int first, int second){
        return first + second;
    }

    public static int subTwoNumbers(int first, int second){
        return first - second;
    }

    public static int minNumberOf(int first, int second){
        return (first > second)? second : first;
    }

    public static int maxNumberOf(int first, int second){
        return (first > second)? first : second;
    }
}
