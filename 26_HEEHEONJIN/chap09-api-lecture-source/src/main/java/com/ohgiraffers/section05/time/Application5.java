package main.java.com.ohgiraffers.section05.time;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application5 {
    public static void main(String[] args) {
        String timeNow = "14:05:10";
        String dateNow = "2025-10-29";
        LocalTime localTime = LocalTime.parse(timeNow);
        LocalDate localDate = LocalDate.parse(dateNow);
        LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "T" + timeNow);

        System.out.println("LocalTime : " + localTime);
        System.out.println("LocalDate : " + localDate);
        System.out.println("LocalDateTime : " + localDateTime);

        dateNow = "221004";
        timeNow = "14-05-10";
    //    System.out.println("LocalDate : " + localDate.parse(dateNow));
        System.out.println("Pattern = " + LocalDate.parse(dateNow, DateTimeFormatter.ofPattern("yyMMdd")));
        System.out.println("Pattern = " + LocalTime.parse(timeNow, DateTimeFormatter.ofPattern("HH-mm-ss")));

        LocalDate localDate1 = LocalDate.now();
        LocalTime localTime1 = LocalTime.now();

        String dateFormat = localDate1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String timeFormat = localTime1.format(DateTimeFormatter.ofPattern("HH시 mm분 ss초"));
        System.out.println("dateFormat = " + dateFormat);
        System.out.println("timeFormat = " + timeFormat);

    }

}
