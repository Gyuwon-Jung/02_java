package com.ohgiraffers.section02.pakage_and_import;

import com.ohgiraffers.section02.pakage_and_import.test.Calculator;
import static com.ohgiraffers.section02.pakage_and_import.test.Calculator.*;

public class Application2 {
    public static void main(String[] args) {
        // non-static-method
        Calculator cal = new Calculator();
        int result = cal.plusTwoNumbers(10, 20);
        System.out.println(result);

        int result2 = Calculator.maxNumberOf(10, 20); // static 메소드 사용방법 1(클래스 명으로 시작)
        System.out.println(result2);

        int result3 = minNumberOf(10, 20); // static 메소드 사용방법2(import static을 이용해서)
        System.out.println(result3);

        int result4 = minNumberOf(10, 20);
    }
}
