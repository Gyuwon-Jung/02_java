package com.ohgirffers.section02.userexception;

import com.ohgirffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgirffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgirffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
            // 정상 동작
            et.checkEnoughMoney(10000, 50000);
            // 상품 가격이 음수일 경우
//            et.checkEnoughMoney(-20000, 10000);
            // 가진 돈이 음수
//            et.checkEnoughMoney(20000, -10000);
            //상품 가격보다 가진 돈이 적은 경우
//            et.checkEnoughMoney(20000, 10000);
            /*
            * |: 동일한 레벨의 다른 타입의 예외를 하나의 catch블록에서 처리 가능
            * 단, 상위 타입의 Exception과 하위 타입의 Exception 함께 서술 될 수 없음
            * */

        } catch (PriceNegativeException | MoneyNegativeException | NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } finally {
            /* try구문이 정상적으로 동작해도 실행하고,
            * exception이 발생해도 finally 구문은 동작함 */
            System.out.println("finally 블럭의 내용이 동작함");
        }

        System.out.println("프로그램 종료");
    }


}
