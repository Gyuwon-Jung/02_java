package com.ohgirffers.section02.userexception;

import com.ohgirffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgirffers.section02.userexception.exception.NegativeExceptioon;
import com.ohgirffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgirffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {

    /* throws 구문 작성 시 여러 Exception을 나열할 수 있으며, 상위 타입의 Exception만 작성할 수도 있음 */
    public void checkEnoughMoney(int price, int money)
            throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {
//            throws NegativeExceptioon, NotEnoughMoneyException {
//            throws Exception {

        if (price < 0) {
            /* throw를 이용해서 이부분에서 강제로 예외를 발생기킴 */
            throw new PriceNegativeException("상품 가격은 음수 일 수 없음");
        }

        if (money < 0) {
            throw new MoneyNegativeException("가지고 있는 돈은 음수 일 수 없음");
        }

        if (money < price) {
            throw new NotEnoughMoneyException("가진 돈보다 상품 가격이 더 비쌉니다.");
        }
        System.out.println("가진 돈이 충분 함. 즐거운 쇼핑");

    }
}
