package com.ohgiraffers.section03.math;

public class Application2 {
    public static void main(String[] args) {
        // Random() > 0.0 < 1.0
        //            0.0 * 10 >= 값 < 1.0 * 10;
        //            0 >= 값 < 10 +++> 0~9
        // (int) (Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최소값

        // 0 ~ 9까지의 난수 발생
        int random1 = (int) (Math.random() * 10);
        System.out.println("0 부터 9 사이의 난수 : " + random1);

        // 1 ~ 10까지의 난수
        int random2 = (int) (Math.random() * 10) + 1;
        System.out.println("1 부터 10 사이의 난수 : " + random2);

        // 10 ~ 15까지의 난수 발생
        int random3 = (int) (Math.random() * 6) + 10;
        System.out.println("10 부터 15 사이의 난수 : " + random3);

        // -128 ~ 127까지의 난수
        //int random4 = (int) (Math.random() * 256) + (-128);
        int random4 = (int) (Math.random() * 256) - 128;
        System.out.println("-128 부터 127까지의 난수 발생 : " + random4);
    }
}
