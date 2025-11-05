package main.java.com.ohgiraffers.section02.userexception;

import main.java.com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import main.java.com.ohgiraffers.section02.userexception.exception.NegativeException;
import main.java.com.ohgiraffers.section02.userexception.exception.NotEoughMoneyException;
import main.java.com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application1 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
            // 상품 가격이 음수인경우
            // et.checkEnoughMoney(-20000, 10000);
            // 가진 돈이 음수
            // et.checkEnoughMoney(20000, -10000);
            //상품 가격보다 가진 돈이 적은 경우
            et.checkEnoughMoney(20000, 10000);

            /*
            * 예외 상황별로 catch 블럭을 따로 작성해서 퍼리할 수 도 있고,
            * 상위 타입의 Exception을 이용해서 통합적으로 처이할 수도 있다.
            * 단, 상위 타입의 exception 블럭이 먼저 기술되면 아래로 코드가 도달할 수 없으프로
            * 컴파일 에러가 발생한다.
            * 서술 순서는 하위 타입 => 상위 타입으로 기재한다.
            * */

//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        } catch (PriceNegativeException e) {
            e.printStackTrace();
        } catch (MoneyNegativeException e) {
            System.out.println(e.getMessage());
        } catch (NotEoughMoneyException | NegativeException e) {
            System.out.println(e.getMessage());
        }
    }
} // 하위부터 상위로 내려온다
