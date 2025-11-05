//package main.java.com.ohgiraffers.section05.time;
//
//import java.time.LocalDateTime;
//import java.util.concurrent.atomic.LongAccumulator;
//
//public class Application3 {
//    public static void main(String[] args) {
//        LocalDateTime localDateTime1 = LocalDateTime.now();
//        LocalDateTime localDateTime2 = LocalDateTime.plusMinutes(30);
//        LocalDateTime localDateTime3 = LocalDateTime.minusHours(3);
//        LocalDateTime localDateTime4 = LocalDateTime.withDayOfYear(1);
//        LocalDateTime localDateTime5 = LocalDateTime.plusDays(20);
//        LocalDateTime localDateTime6 = LocalDateTime.minusYears();
//
//        System.out.println("localDateTime : " + LocalDateTime);
//        System.out.println("분 변경 : " + localDateTime2);
//        System.out.println("시 변경 : " + localDateTime3);
//        System.out.println("일 변경 : " + localDateTime4);
//        System.out.println("일 변경 : " + localDateTime5);
//        System.out.println("년 변경 : " + localDateTime6);
//
//        /*
//        * time 패키지의 클래스들은 불변의 특징을 가지고 있다.
//        * 객체가 가진 년, 월,일, 시, 분, 초 등을 변경하게 되면 새로운 객체가 생성되어 반환되므로
//        * 주소값은 같지 않다.
//        * */
//        System.out.println();
//    }
//}
