package com.sekong.section01.exception;

public class Application2 {
    public static void main(String[] args) {

        ExceptionTest et =  new ExceptionTest();

        try {
            /* try : 예외 발생 가능성이 있는 코드를 작성 */
            et.checkEnoughMoney(10000, 50000);
            et.checkEnoughMoney(50000,10000);

            System.out.println("============== 상품 구입 완료 ================");
        } catch (Exception e) {
            /* catch : try 블럭 안에서 예외가 발생할 경우 catch블럭의 코드가 실행 */
            System.out.println("============== 상품 구입 불가 ================");
            e.printStackTrace();
        }

        System.out.println("프로그램을 종료합니다.");

    }
}
