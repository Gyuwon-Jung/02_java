package com.ohgiraffers.section01.generic;

public class GenericTest <T>{

    /*
    * 제네릭 설정은 클래스 선언부 마지막 부분에 다이아몬드 연산자를 이용하여 작성함
    * 다이아몬드 연산자 내부에 작성하는 영문자는 대문자로 작성함
    * */

    // 다이아몬드 연산자 내부에 작성하는 T는 *타입변수*라고 부름

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
