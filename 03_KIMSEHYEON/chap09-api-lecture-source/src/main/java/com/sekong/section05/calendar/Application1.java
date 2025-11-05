package com.sekong.section05.calendar;

import javax.xml.crypto.Data;
import java.util.Date;

public class Application1 {
    public static void main(String[] args) {
        /*java.util.Data 클래스*/

        /*1. 기본 생성자*/
        Date today = new Date();
        System.out.println(today);

        /*2. 매개변수 있는 생성자 Data(long date)
        * 1970년 1월 1일 0시 0분 0초 이후 지난 시간을 밀리센트로 계산한다.*/
        Date time = new Date(100000L);
        System.out.println(time);

        System.out.println(today.getTime());

        // 1초 : 1000밀리초 1분: 60초 1시간 : 60분 하루: 24
        // 24*60*60*1000 => 하루


    }
}
