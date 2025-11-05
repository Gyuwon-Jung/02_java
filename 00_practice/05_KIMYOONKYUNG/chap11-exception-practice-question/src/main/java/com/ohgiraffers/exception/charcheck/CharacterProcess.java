package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {

    // 기본생성자
    public CharacterProcess() {
    }

    public int countAlpha(String s) throws CharCheckException {
        int alphaCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                throw new CharCheckException("체크할 문자열 안에 공백을 포함할 수 없습니다");
            }
            if (Character.isLowerCase(ch) || Character.isUpperCase(ch)) {
                alphaCount++;
            }
        }
        return alphaCount;
    }
}

