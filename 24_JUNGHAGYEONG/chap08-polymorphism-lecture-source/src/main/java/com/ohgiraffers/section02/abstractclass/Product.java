package com.ohgiraffers.section02.abstractclass;

/* 추상 클래스로 선언 : abstract */
public abstract class Product {

    /* 추상 클래스는 필드를 가질 수 있음 */
    private int nonStaticField;
    private static int staticField;

    /*
    * 추상클래스는 생성자를 가질 수 있음
    * 단, 직접적으로 인스턴스를 생성할 수 없음 (new 연산자 사용 XX)
    * */
    public Product() {
    }

    /* 추상 클래스는 일반적인 메소드를 가질 수 있음 */
    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod!");
    }

    public static void staticMethod() {
        System.out.println("Product 클래스의 staticMethod!");
    }

    /* 추상 메소드(미완성 메소드) 작성 */
    public abstract void abstMethod();

}
