package com.ohgiraffers.section03;

public class B_continue {
    // 4의 배수이면서 5의 배수인 값 풀력
    public void testSimpleContinueStatement(){
        for(int i = 1; i <= 100; i++) {
            if(i%4 != 0 || i % 5 != 0) continue;

            System.out.println(i);
        }
    }

    public void testSimpleContinueStatement2(){

        //중펍 반복문 내 continue사용에 대한 흐름
        //continue 는 모드ㅡㄴ 반복문을 뛰어 넘는 것이 아니라 가장 인저ㅓㅂ한 반복문의 실행만 건너뜀.
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("=====" + dan + " 단 =====");
            for (int su = 1; su <= 9; su++) {
                if(su % 2 == 0) continue;
                System.out.println(dan + "*" + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }

    public void testSimpleContinue(){
        label:
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("=====" + dan + " 단 =====");
            for (int su = 1; su <= 9; su++) {
                if(su % 2 == 0) continue label;
                System.out.println(dan + "*" + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }
}
