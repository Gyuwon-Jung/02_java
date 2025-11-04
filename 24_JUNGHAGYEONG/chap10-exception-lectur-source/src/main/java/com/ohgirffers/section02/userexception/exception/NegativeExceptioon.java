package com.ohgirffers.section02.userexception.exception;

/*
* 사용자 정의 예외클래스 만들기 위해서는 Exception 클래스를 상속받으면 됨
* 경우에 따라서는 더 상위 타입인 Throwable클래스나 하위 타입의 클래스를 상속 받ㄷ기도 함
* */
public class NegativeExceptioon extends Exception{

    public NegativeExceptioon(String message) {
        super(message);
    }


}
