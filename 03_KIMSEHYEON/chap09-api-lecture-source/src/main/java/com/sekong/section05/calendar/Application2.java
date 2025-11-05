package com.sekong.section05.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {
        /* Calender 클래스 사용*/

        /*1. getInstance() static 메소드 이용*/
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        /*2. GregorianCalendar 이용 방법*/
        Calendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar);

        // 2-2 년, 월, 일, 시, 분, 초 정보를 이용해서 인스턴스를 생성
        // 2025.10.28.16.27.00
        int year = 2025;
        int month = 10;
        int day = 28;
        int hour = 16;
        int min = 27;
        int sec = 1;

        Calendar calendar1 = new GregorianCalendar(year, month, day, hour, min, sec);
        System.out.println(calendar1);

        /*
         *  상황에 따라 특정 일자를 기준으로 한 Date 타입의 인스턴스가 필요한 경우도 있다.
         *  먼저 GregorianCalendar를 이용해서 특정 날짜/시간 정보로 인스턴스를 생성한 후
         *  1970년 1월 1일 0시 0분 0초를 기준으로 지난 시간을 millisecond로 계산해서
         *  long형으로 반환하는 메소드가 있다.
         * */

        System.out.println(calendar1.getTimeInMillis());

        Date date = new Date(calendar1.getTimeInMillis());
        System.out.println(date);

        /* 실제 사용시 이런 형태로 사용되는 경우가 많다. */
        Date date2 = new Date(new GregorianCalendar(year, month, day, hour, min, sec).getTimeInMillis());

        /* 생성된 인스턴스의 필드 정보를 Calendar 클래스에 있는 get() 메소드를 이용하여 반환받을 수 있다.*/
        int cTear = calendar1.get(1);
        int cMonth = calendar1.get(2);
        int cDayOfMonth = calendar1.get(5);


        /*
         *  인자로 전달하는 정수에 따라 필드 값을 반환받을 수 있다.
         *  하지만 이렇게 사용하게되면 각필드에 매칭되는 정수를 다 외워야 사용이 가능해진다.
         *  따라서 저러한 정수를 상수 필드 형태로 제공하고 있다.
         * */

        System.out.println(Calendar.YEAR);
        System.out.println(Calendar.MONTH);
        System.out.println(Calendar.DATE);

        System.out.println("year : " + calendar1.get(Calendar.YEAR));
        System.out.println("month : " + calendar1.get(Calendar.MONTH));
        System.out.println("dayOfMonth : " + calendar1.get(Calendar.DATE));
        /* 요일 (일(1), 월(2), 화(3), 수(4), 목(5), 금(6), 토(7)) 의미이다. */
        System.out.println("dayOfWeek : " + calendar1.get(Calendar.DAY_OF_WEEK));

        String days = "";
        switch (calendar1.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY: days = "일"; break;
            case Calendar.MONDAY: days = "월"; break;
            case Calendar.TUESDAY: days = "화"; break;
            case Calendar.WEDNESDAY: days = "수"; break;
            case Calendar.THURSDAY:days = "목"; break;
            case Calendar.FRIDAY:days = "금"; break;
            case Calendar.SATURDAY:days = "토"; break;
        }
        System.out.println("요일 : " +  days);



    }
}
