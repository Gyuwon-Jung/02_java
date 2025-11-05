package com.sekong.exception.string;

public class StringValidator {
    public boolean isValidLength(String s) throws StringLengthException{
        if(s.length()<5|| s.length()>10){
            throw new StringLengthException("문자열의 길이는 5자 이상, 10자 이하이어야 합니다. (현재 길이: "+s.length()+")");
        }
        return true;
    }

}
