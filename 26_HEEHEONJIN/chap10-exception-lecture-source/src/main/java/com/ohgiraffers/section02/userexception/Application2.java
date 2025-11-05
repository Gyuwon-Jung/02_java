package main.java.com.ohgiraffers.section02.userexception;

import main.java.com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import main.java.com.ohgiraffers.section02.userexception.exception.NegativeException;
import main.java.com.ohgiraffers.section02.userexception.exception.NotEoughMoneyException;
import main.java.com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try {
            /*|: 동일한 레벨의 다른 타입의 예외를 하나의 catch블록에서 처리핧 수 있다.
             * 단, 상위 타입의 Exception 과 하위 타입의 Exception 함께 서술 될수 없다.
             * */
            et.checkEnoughMoney(20000, 10000);
        } catch (PriceNegativeException | MoneyNegativeException | NotEoughMoneyException e) {
            System.out.println(e.getMessage());
        } finally { //정상 작동해도 동작
            /*try 구문이 정상적으로 동작해도 실핻하고,
            * exception이 발생해도 finally 구문은 동작을 한다.
            * */
            System.out.println("finally 블럭의 내용이 동작함.");
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
