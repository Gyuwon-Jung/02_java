package main.java.com.ohgiraffers.section05.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.TimeZone;

public class Application1 {
    public static void main(String[] args) {
        //loocalTime
        //now() : 자신의 PC의 현재 시간 기준으로 LocalTime객체 반환
        // of() : 매개변수로 받은 시간 기준으로 localTime 객체 반환
        LocalTime timeNow = LocalTime.now();
        LocalTime timeOf = LocalTime.of(9, 12, 1);


        System.out.println("timeNow : " + timeNow);
        System.out.println("timeOf : " + timeOf);

        // localDate
        //now() : 자신의 PC의 현재 날짜 기준으로 localDate 반환
        // of() : 매개변수로 받은 날짜 기준으로 localDate 객체 반환

        LocalDate dateNow = LocalDate.now();
        LocalDate dateOf = LocalDate.of(2005, 1, 1);
        System.out.println("dateOf : " + dateNow);
        System.out.println("dateNow : " + dateNow);
        System.out.println("dateOf : " + dateOf);

        // LocalDateTime
        //now() : 자신의 PC의 현재 시간과 날짜 기준으로 LocalDateTime 반환
        // of() : 매개변수로 받은 시간과 날짜 기준으로 LocalDateTime 객체 반환
        LocalDateTime dateTimeNow = LocalDateTime.now();
        LocalDateTime dateTimeOf = LocalDateTime.of(dateNow, timeNow);

        System.out.println("dateTimeNow : " + dateTimeNow);
        System.out.println("dateTimeOf : " + dateTimeOf);

        // ZonedDateTime
        // now() : ZoneId를 매개변수로 넘겨주면 ZonedDateTime 객체를 반환
        // of() : 매개변수로 java.util.Timezone의 getAvailableIDs() 메소드가 반환하는 값을 넣어 ZoneId반홭 받을 수 있다.
        String[] iDs = TimeZone.getAvailableIDs();
        for (int i = 0; i < iDs.length; i++) {
            System.out.println(iDs[i]);
        }

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        // ZonedDateTime zonedDateTimeOf = zonedDateTimeNow.of(dateOf, timeOf);

        System.out.println("zonedDateTimeNow : " + zonedDateTimeNow);
        // System.out.println("zonedDateTimeOf : " + zonedDateTimeOf);

    }
}
