package com.ohgiraffers.api.string;

import java.util.Locale; // java.util.Locale 임포트 필요

public class StringProcess {

    public String preChar(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        // 첫 글자를 대문자로 변환 (Locale.ROOT 사용)
        String firstChar = s.substring(0, 1).toUpperCase(Locale.ROOT);

        // 나머지 문자열
        String restOfString = s.substring(1);

        // 첫 글자 + 나머지 문자열 반환
        return firstChar + restOfString;
    }

    // 1. main 메소드 밖으로 이동
    public int charSu(String s, char ch) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // main 메소드에서 위 메소드들을 사용하려면 StringProcess 객체를 생성해야 합니다.
        StringProcess processor = new StringProcess();
        String testString = "hello world";

        // preChar 메소드 사용 예
        String processed = processor.preChar(testString);
        System.out.println("preChar 결과: " + processed); // 결과: Hello world

        // charSu 메소드 사용 예
        int charCount = processor.charSu(testString, 'l');
        System.out.println("charSu 결과 (l 개수): " + charCount); // 결과: 3
    }
}