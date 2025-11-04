package com.ohgiraffers.section07.initblock;

public class Application {

    public static void main(String[] args) {

        Product product = new Product();
        System.out.println("product.informaiton : " + product.getInformation());

        Product product2 = new Product("대륙폰", 500000, "샤우미");
        System.out.println("product.informaiton : " + product2.getInformation());
    }
}
