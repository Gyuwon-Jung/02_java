package com.ohgiraffers.section05.time;

import java.time.LocalDateTime;

public class Application3 {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.plusMinutes(30);
        LocalDateTime localDateTime2 = localDateTime1.minusHours(3);
        LocalDateTime localDateTime3 = localDateTime2.withDayOfYear(1);
        LocalDateTime localDateTime4 = localDateTime2.plusDays(20);
        LocalDateTime localDateTime5 = localDateTime2.minusYears(10);

        System.out.println("localDateTime : " + localDateTime);
        System.out.println("분 변경 : " + localDateTime1);
        System.out.println("시 변경 : " + localDateTime2);
        System.out.println("일 변경 : " + localDateTime3);
        System.out.println("일 변경 : " + localDateTime4);
        System.out.println("년 변경 : " + localDateTime5);

        /*
        * time패키지의 클래스들은 불변의 특징을 가지고 있음
        * 객체가 가진 년, 월, 일, 시, 분, 초 등을 변경하게 되면 새로운 객체가 생성되어 반환하므로
        * 주소값은 같지 않음
        * */
        System.out.println(localDateTime ==  localDateTime1);
        System.out.println(localDateTime ==  localDateTime2);
        System.out.println(localDateTime ==  localDateTime3);
        System.out.println(localDateTime ==  localDateTime4);
        System.out.println(localDateTime ==  localDateTime5);

    }
}
