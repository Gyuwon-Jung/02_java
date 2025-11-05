package com.ohgiraffers.section02.loop;

import java.util.Scanner;

public class C_while {
    public void testSimpleWhileStatement() {

        // 초기식
        int i = 0;
        // 조건식
        while (i < 10) {}
        // 반복할 내용
        System.out.println("출력 : " + (i + 1));
        // 증감식
    }

    public void testWhileExample() {
        Scanner sc = new Scanner(System.in);
        String input = " ";

        while(!input.equals("exit")) {
            System.out.print("문자열 입력: ");
            input = sc.nextLine();
            System.out.println("입력받은 값: " + input);

        }
    }

    public void testSimpleDoWhileStatement() {
        do {
            System.out.println("조건이 false여도 최초 한번은 무조건 동작한다.");
        } while (false);
    }
}
