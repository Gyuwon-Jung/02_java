package com.sekong.section2.abstractclass;
// 추상 클래스로 선언
public abstract class Product {

    // 추상클래스는 필드를 가질 수 있다.
    private int nonStaticField;
    private static int staticField;

    /*
    * 추상클래스는 생성자를 가질 수 있다.
    * 단, 직접적으로 인스턴스를 생성할 수는 없다.
    * */


    public Product(){

    }
    public void nonStaticMethod(){
        System.out.println("nonStaticMethod of Product Class");
    }
    public void staticMethod(){
        System.out.println("staticMethod of Product Class");
    }
    // 추상 메소드(미완성 메소드) 작성
    public abstract void abstMethod();

}
