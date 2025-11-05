package com.ohgiraffers.section01.level01.basic;

public class Calculator {

    // 기능용 클래스

    // 반환값 : x
    // 메소드명 : checkMethod
    // 호출하면 "메소드 호출 확인"을 출력하는 기능의 메소드
    static void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    // 반환값 : String
    // 메소드명 : sumTwoNumber
    // 두개의 전달인자를 받아 두수의 합을 반환
    // 출력의 내용은 "10과 20의 합은 30입니다." 라는 문장을
    // 출력하는 기능
    static String sumTwoNumber(int a, int b){
        int sum = a + b;
        String result = a + "과 " + b + "의 합은 " + sum + "입니다.";
        System.out.println(result);
        return result;
    }
//
//    // 반환값 : String
//    // 메소드명 : multiTwoNumber
//    // 두개의 전달인자를 받아 두수의 곱을 반환
//    // 출력의 내용은 "10과 20의 곱은 200입니다." 라는 문장을
//    // 출력하는 기능
    static String multiTwoNumber(int a, int b){
        int multiple = a * b;
        String result = a + "과 " + b + "의 곱은 " + multiple + "입니다.";
        System.out.println(result);
        return result;
    }

    // 반환값 : int
    // 메소드명 : multiTwoNumber2
    // 두개의 전달인자를 받아 두수의 곱을 반환


    // 출력의 내용은 "10과 20의 곱은 200입니다." 라는 문장을
    // 출력하는 기능

    static int multiTwoNumber2(int x, int y){
        int multiple = x * y;
        return multiple;
    }
}
