package com.ohgiraffers.api.token;

import java.util.Arrays;

public class TokenTest {
    public static void main(String[] args) {
        String str = "J a v a P r o g r a m ";
        System.out.println("Token: " + str);
        System.out.println("토글 처리 전");
        System.out.println(str.length());

        String [] tokenArray = str.split(" "); //공백 단위로 분리

        //토큰 처리 후
        System.out.println("토큰 처리 후");
        System.out.println(tokenArray.length);

        char[] charArr = new char[tokenArray.length];
        for (int i = 0; i < tokenArray.length; i++) {
            charArr[i] = tokenArray[i].charAt(0);
        }

        System.out.println(charArr + "출력"); //???????

        System.out.println((charArr +"배열내용" + Arrays.toString(charArr));

        String fianlString = new String(charArr);
        System.out.println(fianlString.toUpperCase());

        System.out.println("대문자로 출력");
        System.out.println("공백 제거: " + fianlString);
        System.out.println("모두 대문자로 변환: " + fianlString.toUpperCase());
    }
}

