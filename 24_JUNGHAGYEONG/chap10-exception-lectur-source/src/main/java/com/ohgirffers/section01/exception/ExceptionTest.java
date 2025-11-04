package com.ohgirffers.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws Exception {

        System.out.println("가지고 계신 돈은 " + money + "입니다.");

        if (money >= price) {
            System.out.println("상품을 구입하기 위한 금액 충분");
        } else {
            // System.out.println("상품을 구입하기 위한 금액 부족");
            throw new Exception();
        }

        System.out.println("즐거운 쇼핑 ");
    }
}
