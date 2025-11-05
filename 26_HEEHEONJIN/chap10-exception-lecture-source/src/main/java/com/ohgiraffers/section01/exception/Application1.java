package main.java.com.ohgiraffers.section01.exception;

public class Application1 {
    public static void main(String[] args) throws Exception {
        /*
        * 강제로 예외를 발생
        * throw new 예외클래스명();
        *
        * 예외처리방법 
        * 1. throw 위임 // 나도 몰라 이놈아
        * 2. try-catch로 위임
        *
        * */
        ExceptionTest et = new ExceptionTest();
        et.checkEnoughMoney(10000, 50000);
        et.checkEnoughMoney(50000, 10000);
        System.out.println("프로그램을 종료합니다.");
    }
}
