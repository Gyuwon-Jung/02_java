package com.ohgiraffers.section02.pakage_and_import;

// import com.ohgiraffers.section02.pakage_and_import.test.Calculator;
// import 등록을 생략해도 사용가능한 패키지가 있는데, java.lan 패키지를 의미한다.
// 워낙 기본이 되는 패키지다보니, 생략해도 컴파일러가 알아서 실
public class Application1 {
    public static void main(String[] args) {

        com.ohgiraffers.section02.pakage_and_import.test.Calculator cal = new com.ohgiraffers.section02.pakage_and_import.test.Calculator();
        // Calculator calculator = new Calculator();

        int result1 = cal.plusTwoNumbers(10, 20);
        int result2 =cal.subTwoNumbers(10, 20);
        int result3 =cal.minNumberOf(10,20);
        int result4 =cal.maxNumberOf(10,20);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
