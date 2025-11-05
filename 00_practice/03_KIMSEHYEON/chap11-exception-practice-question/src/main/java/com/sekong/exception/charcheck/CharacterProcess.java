package com.sekong.exception.charcheck;

public class CharacterProcess {
    public CharacterProcess() {
    }

    public int countAlpha(String s) throws CharCheckException {
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if ((s.charAt(i) >= 65 && s.charAt(i) <= 90)||(s.charAt(i) >= 97 && s.charAt(i) <= 122)) {
                count++;
            }else {
                throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");

            }
        }
        return count;
    }
}
