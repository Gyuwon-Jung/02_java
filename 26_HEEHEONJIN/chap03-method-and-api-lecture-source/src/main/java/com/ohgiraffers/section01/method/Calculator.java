package com.ohgiraffers.section01.method;

public class Calculator {
    public int plusTwoNumbers(int first, int second){
        return first + second;
    }

    public int subTwoNumbers(int first, int second){
        return first - second;
    }

    public int minNumberOf(int first, int second){
        return (first > second)? second : first;
    }

    public int maxnNumberOf(int first, int second){
        return (first > second)? first : second;
    }
}
