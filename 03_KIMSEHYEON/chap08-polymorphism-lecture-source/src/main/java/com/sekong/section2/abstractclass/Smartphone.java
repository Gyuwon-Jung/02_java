package com.sekong.section2.abstractclass;

/* 추상 클래스를 상속받는 경우 추상 메소드를 반드시 오버라이딩 해야한다.
* (오버라이딩 강제화)*/
public class Smartphone extends Product {

    @Override
    public void abstMethod() {
        System.out.println("Produnt 클래스의 absMethod 오버라이딩한 메소드");
    }

    public void printSmartPhone(){
        System.out.println("SmartPhone 클래스의 PrintSmartPhone 메소드");
    }
}
