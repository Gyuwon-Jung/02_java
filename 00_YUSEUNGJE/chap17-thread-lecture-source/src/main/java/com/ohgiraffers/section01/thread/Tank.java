package com.ohgiraffers.section01.thread;

public class Tank extends Thread {

    @Override
    public void run() {

        for(int i = 0; i < 1000; i++) {
            System.out.println("Tank Shooting....");

            /* 현재 스레드를 지연 시키는 메소드로 전달 인자로 밀리세컨초를 전달*/
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
