package com.ohgiraffers.section07.initblock;

public class Product {

    /* 1. JVM 기본값 : null 0 null */
    /* 2. 명시적 초기화 : 은하수 200000 삼송 */
    private String name = "은하수";
    private int price = 2000000;
    private static String brand = "삼송";

    /* 초기화 블록 */
    /* 인스턴스 초기화 블럭 */
    {
        name = "사이언";
        price = 800000;

//        brand = "사과";
        System.out.println("인스턴스 초기화 블럭 동작함");
    }

    /* static 초기화 블럭 */
    static {
        brand = "헬지";

        System.out.println("static 초기화 블럭 동작함");
    }


    /* 4.기본 생성자 */
    public Product() {
        System.out.println("기본 생성자 동작 함");
    }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 생성자 동작함");
    }

    public String getInformation() {
        return this.name + " " + this.price + " " + Product.brand;
    }

}
