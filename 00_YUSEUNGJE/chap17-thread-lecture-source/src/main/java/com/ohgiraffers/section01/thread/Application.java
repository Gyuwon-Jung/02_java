package com.ohgiraffers.section01.thread;

public class Application {

    public static void main(String[] args) {

        /*
        * Thread를 생성하는 방법
        * 1. Thread 클래스 상속
        * 2. Runnable 인터페이스를 구현
        * */
        Thread t1 = new Car(); // Thread
        Thread t2 = new Tank(); // Thread
        Thread t3 = new Thread(new Plane()); // Runnable

        /* 기본적으로 가지고 있는 우선 순위 */
        System.out.println("t1 우선 순위: " + t1.getPriority());
        System.out.println("t2 우선순위: " + t2.getPriority());
        System.out.println("t3 우선 순위: " + t3.getPriority());

        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        System.out.println("t1 우선 순위: " + t1.getPriority());
        System.out.println("t2 우선순위: " + t2.getPriority());
        System.out.println("t3 우선 순위: " + t3.getPriority());

        /* run() 메소드 호출 시 별도의 스레드로 동작하지 않고 메인 스레드가
        * 메소드를 호출하는 방식으로 동작한다.
        * */
//        t1.run();
//        t2.run();
//        t3.run();
        /* start() 메소드 호출 시 별도의 호출 스택을 생성하여 각각의 스레드가 동작한다. */
        t1.start();
        t2.start();
        t3.start();
    }
}
