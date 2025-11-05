//package main.java.com.ohgiraffers.section05.calendar;
//
//import java.sql.SQLOutput;
//import java.time.Month;
//import java.time.Year;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//
//public class Application2 {
//    public static void main(String[] args) {
//        /* Calendar 클래스 사용*/
//
//        /*1. getInstance() static 메소드 이용*/
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar);
//
//        /* 2.GregorianCalendar*/
//        Calendar gregorianCalendar = new GregorianCalendar();
//        System.out.println(gregorianCalendar);
//
//        /*2-2. 년,월,일,시,분,초 정보를 이용해서 인스턴스를 생성*/
//        /*2025년 10월 28일 16:27:00*/
//        int year = 2025;
//        int month = 9; //월은 0~11월로 사용하기 때문에 9는 10월이다.
//        int datOfMonth = 28;
//        int min = 27;
//        int second = 0;
//
//        Calendar calendar1 = new GregorianCalendar(year, month, datOfMonth, min, second);
//        System.out.println(calendar1);
//
//        /*
//        * 상황에 따라 특정 일자를 기준으로 한 Date타입의 인스턴스가 필요한 경우도 있다.
//        * 먼저 GregorianCalendar 를 이용해서 특정 날짜/시간 정보로 인스턴스를 생성한 후
//        * 1970년 1월 1일 0시 0분 0초를 기준으로 지난 시간을 millisecond로 계산해서
//        * long형으로 반환하는 메소드가 있다.
//        * */
//        System.out.println(calendar1.getTimeInMillis());
//
//        Date date = new Date(calendar1.getTimeInMillis());
//        System.out.println(date);
//
//        /*실제 사용시 이런 형태로 사용되는 경우가 많다.*/
//        Date date2 = new Date(new GregorianCalendar(year, month, datOfMonth, min, second).getTimeInMillis());
//
//        /*생성된 인스턴스의 필드 정보를 Calendar 클래스에 있는 get() 메소드를 사용하여 반환받을 수 있다.*/
//        int cYear = Calendar1.get(1);
//        int cMonth = Calendar1.get(2);
//        int cDayOfMonth = Calendar1.get(5);
//
//        /*
//        * 인자로 전달하는 정수에 따라 핑드 값을 반환받을 수 있다.
//        * 하지만 이렇게 사용하게 되면 각필드에 매칭되는 정수를 다 외워야 사용이 가능해진다.
//        * 따라서 저러한 정수를 상수 핑드 형태로 제공하고 있다.
//        * */
//        System.out.println(Calendar, YEAR); // 1
//        System.out.println(Calendar, MONTH); // 2
//        System.out.println(Calendar. DATE); // 5
//
//        System.out.println("Year : " + calendar.get(Calendar.YEAR));
//        System.out.println("Month : " + calendar.get(Calendar.MONTH));
//        System.out.println("Date : " + calendar.get(Calendar.DATE));
//        // 요일 (일(1), 월(2), 화(3), 수(4), 목(5), 금(6), 토(7)) 의미이다.
//        System.out.println("Date of Month : " + calendar.get(Calendar.DATE));
//
//        String day = "";
//        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
//            case Calendar.SUNDAY: day = "일"; break;
//            case Calendar.MONDAY: day = "월"; break;
//            case Calendar.TUESDAY: day = "화"; break;
//            case Calendar.WEDNESDAY: day = "수"; break;
//            case Calendar.THURSDAY: day = "목"; break;
//            case Calendar.FRIDAY: day = "금"; break;
//            case Calendar.SATURDAY: day = "토"; break;
//        }
//        System.out.println("요일 : + day");
//
//        System.out.println("amPm : " + calendar1.get(Calendar.AM_PM));                //0은 오전 1은 오후
//
//        System.out.println(calendar1.get(Calendar.AM_PM) == Calendar.AM? "오전": "오후");
//
//        System.out.println("hourOfDay : " + calendar1.get(Calendar.HOUR_OF_DAY));    //24시간 체계
//        System.out.println("hour : " + calendar1.get(Calendar.HOUR));                //12시간 체계
//
//        System.out.println("min : " + calendar1.get(Calendar.MINUTE));
//        System.out.println("second : " + calendar1.get(Calendar.SECOND));
//    }
//
//
//}
