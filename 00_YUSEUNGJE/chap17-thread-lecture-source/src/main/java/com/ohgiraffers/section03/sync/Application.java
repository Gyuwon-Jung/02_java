package com.ohgiraffers.section03.sync;

public class Application {

    public static void main(String[] args) {

        // 공유 자원 인스턴스
        Buffer buffer = new Buffer();

        Thread b1 = new Producer(buffer);
        Thread b2 = new Consumer(buffer);

        b1.start();
        b2.start();
    }
}
