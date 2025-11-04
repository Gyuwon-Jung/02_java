package com.ohgiraffers.section04.wrapper;

public class Application1 {

    public static void main(String[] args) {

        /*
        * 박싱(Boxing)과 언박싱(UnBoxing)
        * 기본타입을 태퍼믈래스의 인스턴스로 인스턴스화 하는 것을 박싱(Boxing)이라함
        * 래퍼클래스 타입의 인스턴스를 기본타입으로 변경 하는 것을 언박싱(UnBoxing)이라함
        * */
        int intValue = 20;
//        Integer boxingNumber1 = new Integer(intValue);
        Integer boxingNumber1 = Integer.valueOf(intValue); // static메소드 int -> Integer

        int unBoingNumber = boxingNumber1.intValue(); // Integer -> int

        // 오토박싱
        Integer boxingnumber2 = intValue;

        // 오토언박싱
        int unBoxingNumber2 = boxingnumber2;

        int inum = 20;
        /*
        * Integer.valueOf() 메소드가 byte범위의 숫자는 캐싱처리하고 있어서
        * integerNum1 == integerNum2 true가 나올수 있음
        * */
        Integer integerNum1 = Integer.valueOf(20);
        Integer integerNum2 = Integer.valueOf(20);
        Integer integerNum3 = 20;
        Integer integerNum4 = 20;

        System.out.println("int와 Integer 비교 : " + (inum == integerNum1)); // Integer, int 값 비교
        System.out.println("int와 Integer 비교 : " + (inum == integerNum3));

        System.out.println("Integer와 Integer 비교 : " + (integerNum1 == integerNum2)); // Integer, Integer 주소값비교
        System.out.println("Integer와 Integer 비교 : " + (integerNum1 == integerNum3));

        /* 인스턴스의 값 비교는 항상 equals()메소드를 활용 함 */
        System.out.println(integerNum1.equals(integerNum2));

    }
}
