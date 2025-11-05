package com.ohgiraffers.section01.level01.normal;

public class RandomMaker {
    // 기능형 클래스
    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : tossCoin
     *
     * 동전 앞/뒤 중에 하나를 출력
     * (앞면,뒷면은 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 앞면
     *
     * */
//    public static void tossCoin() {
//        int val = (int) (Math.random() * 2) + 1;
//        switch(val) {
//            case 1:
//                System.out.println("앞");
//                break;
//            case 2:
//                System.out.println("뒷면");
//                break;
//            default:
//                System.out.println("error");
//                break;
//        }
//    }
    public static void tossCoin(){
        int val = (int) (Math.random() * 2) + 1;
        String s = (val % 2 == 0) ? "짝수입니다." : "홀수입니다.";
        System.out.println(s);
    }
}
