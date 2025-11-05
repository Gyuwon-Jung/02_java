package com.sekong.section05.time;

import java.time.*;
import java.util.TimeZone;

public class Application1 {

    public static void main(String[] args) {

        // LocalTime
        // now() : 자신의 PC의 현재 시간 기준으로 LocalTime 객체 반환
        // of() : 매개변수로 받은 시간 기준으로 LocalTime 객체 반환
        LocalTime timeNow = LocalTime.now();
        LocalTime tineOf = LocalTime.of(9, 12, 1);
        System.out.println("timeNow : " + timeNow);
        System.out.println("tineOf : " + tineOf);

        // LocalDate
        // now() : 자신의 PC의 현재 날짜 기준으로 LocalDate 객체 반환
        // of() : 매개변수로 받은 날짜 기준으로 LocalDate 객체 반환
        LocalDate dateNow = LocalDate.now();
        LocalDate dateOf = dateNow.of(2025, 1, 1);
        System.out.println("dateNow : " + dateNow);
        System.out.println("dateOf : " + dateOf);

        // LocalDateTime
        // now() : 자신의 PC의 현재 시간과 날짜 기준으로 LocalDate 객체 반환
        // of() : 매개변수로 받은 시간과 날짜 기준으로 LocalDate 객체 반환
        LocalDateTime dateTimeNow = LocalDateTime.now();
        LocalDateTime dateTimeOf = LocalDateTime.of(dateNow, timeNow);
        System.out.println("dateTimeNow : " + dateTimeNow);
        System.out.println("dateTimeOf : " + dateTimeOf);

        // ZonedDateTime
        // now() : ZoneId를 매개변수로 넘겨주면 ZonedDateTime 객체를 반환
        // of() : 매개변수로 java.util.Timezone의 getAvailableDs() 메소드가 반환하는 값을 넣어 ZoneId를 반환 받을 수 있다.

//        String[] iDs = TimeZone.getAvailableIDs();
//        for(int i = 0; i < iDs.length; i++){
//            System.out.println(iDs[i]);
//        }

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        ZonedDateTime zonedDateTimeOf = zonedDateTimeNow.of(dateOf, tineOf, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTimeNow : " + zonedDateTimeNow);
        System.out.println("zonedDateTimeOf : " + zonedDateTimeOf);
    }
}