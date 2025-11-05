package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test();
    }
    public void test() {
        Scanner sc = new Scanner(System.in);
        CharacterProcess cp = new CharacterProcess();

        System.out.println("공백없이 문자열 입력하세요");
        String input = sc.nextLine();

        try {
            int count = cp.countAlpha(input);

        }0o.
        catch{}
        finally{}





    }
}


   /* try {
        int count = cp.countAlpha(input);
        System.out.println("=================================================");
        System.out.println("입력한 문자열: " + input);
        System.out.println("영문자(알파벳)의 총 개수: " + count + "개");
        System.out.println("=================================================");

    } catch (CharCheckException e) {
        // 예외 발생 시 에러 메시지 출력
        System.err.println("[오류 발생]: " + e.getMessage());

    } finally {
        sc.close();
        System.out.println("프로그램을 종료합니다.");
    }
}
}
        */