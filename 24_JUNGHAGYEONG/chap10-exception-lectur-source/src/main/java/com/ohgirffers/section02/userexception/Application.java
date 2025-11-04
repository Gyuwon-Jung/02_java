package com.ohgirffers.section02.userexception;

import com.ohgirffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgirffers.section02.userexception.exception.NegativeExceptioon;
import com.ohgirffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgirffers.section02.userexception.exception.PriceNegativeException;

public class Application {

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
            // 상품 가격이 음수일 경우
//            et.checkEnoughMoney(-20000, 10000);
            // 가진 돈이 음수
//            et.checkEnoughMoney(20000, -10000);
            //상품 가격보다 가진 돈이 적은 경우
            et.checkEnoughMoney(20000, 10000);

            /*
            * 예외 상황별로 catch블럭을 따로 작성해서 처리할 수도 있고,
            * 상위 타입의 Exception을 이용해서 통합적으로 처리할 수도 있음
            * 단, 상위 타입의 Exception블럭이 먼저 기술되면 아래로 코드가 도달할 수 없으므로 컴파일 에러 발생함
            * 서술 순서는 하위타입 => 상위 타입으로 기재함
            * */
        } catch (Exception e) {
            e.printStackTrace();
        }
//        } catch (PriceNegativeException e) {
//            e.printStackTrace();
//        } catch (MoneyNegativeException e) {
//            System.out.println(e.getMessage());
//        } catch (NotEnoughMoneyException e) {
//            System.out.println(e.getMessage());
//        }
    }

}
