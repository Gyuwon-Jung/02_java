package com.sekong.section02.userexception.exception;

/*
* 사용자 정의 예외클래스를 만들기 위해서는 Exception 클래스를 상속받으면 된다.
* 경우에 따라서는 더 상위 타입인 Throwable클래스나 하위 타입의 클래스를 상속받기도 한다.
* */
public class NegativeException extends Exception {

    public NegativeException(String message) {
        super(message);
    }
}
